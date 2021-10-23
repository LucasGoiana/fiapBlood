package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.geographic.GeographicPointsDTO;

public interface GeoLocationService {

    GeographicPointsDTO getGeographicCoordinates(String street, String district, String city);
    Double calculateDistance(double lat1, double lon1, double lat2, double lon2);

}
