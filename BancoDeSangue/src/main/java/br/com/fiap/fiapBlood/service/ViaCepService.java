package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.viacep.ViaCepDTO;

public interface ViaCepService {
    ViaCepDTO getInfoAddress(String cep);
}
