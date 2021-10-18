package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.geographic.GeographicPointsDTO;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GeoLocationServiceImpl implements GeoLocationService {


    @Value("${client.nominatim.baseUrl}")
    private String url;

    @Value("${client.nominatim.formatData}")
    private String format;

    @Value("${client.nominatim.limit}")
    private String limit;



    public GeographicPointsDTO getGeographicCoordinates(String street, String district, String city){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(url + "?" + format + "&city=" + city + "&q=" + street + "," + district + "&limit=" + limit )
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
        try(Response response = client.newCall(request).execute()){
            if (!response.isSuccessful()) throw new ResponseStatusException(HttpStatus.valueOf(response.code()),response.body().string());


            JSONArray arrayResponse = new JSONArray(response.body().string());
            if(arrayResponse.isEmpty()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Não foi possivel recuperar a longitute e latitude do endereço: %s, %s - %s",street,district,city));

            try{
                GeographicPointsDTO geographicPointsDTO = new GeographicPointsDTO();
                geographicPointsDTO.setLatitude(arrayResponse.getJSONObject(0).getString("lat"));
                geographicPointsDTO.setLongitude(arrayResponse.getJSONObject(0).getString("lon"));
                return geographicPointsDTO;
            }catch (Exception e){
                throw  new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Não foi possivel processar a solicitacao devido a um erro de leitura no retorno da consulta de longitude e latitude");
            }

        }catch (ResponseStatusException res){
            throw new ResponseStatusException(res.getStatus(), res.getReason());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "erro ao processar solicitacao de consulta de longitude e latitude");
        }
    }



    public double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        dist = dist * 1.609344;

        return (dist);
    }


    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

}
