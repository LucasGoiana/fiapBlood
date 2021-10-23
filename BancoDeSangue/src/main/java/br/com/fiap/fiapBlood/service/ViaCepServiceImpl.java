package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.viacep.ViaCepDTO;
import lombok.Setter;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
public class ViaCepServiceImpl implements ViaCepService {

    @Value("${client.viacep.baseUrl}")
    private String url;


    public ViaCepDTO getInfoAddress(String cep){
        cep = cep.replace("-","");

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(String.format(url,cep))
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();

        try (Response response = client.newCall(request).execute()) {

            if (!response.isSuccessful())
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, response.body().string());

            try{

                JSONObject object = new JSONObject(response.body().string());
                var address = ViaCepDTO.builder()
                        .cep(object.getString("cep"))
                        .bairro(object.getString("bairro"))
                        .complemento(object.getString("complemento"))
                        .ddd(object.getString("ddd"))
                        .gia(object.getString("gia"))
                        .ibge(object.getString("ibge"))
                        .localidade(object.getString("localidade"))
                        .logradouro(object.getString("logradouro"))
                        .siafi(object.getString("siafi"))
                        .uf(object.getString("uf"))
                        .build();

                return address;
            }catch (Exception e){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Não foi possivel encontrar o cep informado");
            }

        }catch (ResponseStatusException res){
            throw new ResponseStatusException(res.getStatus(), res.getReason());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "erro ao processar solicitacao de consulta de endereco");
        }

    }



}
