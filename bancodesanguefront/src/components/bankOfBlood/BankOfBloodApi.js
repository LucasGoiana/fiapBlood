import axios from "axios";

const BASE_URL = 'http://localhost:8080';
//const BASE_URL = process.env.host;

const create = ( nome, horariodeatendimento, telefone, cep, logradouro, numero, complemento, bairro, cidade, uf) => {

    const url = `${BASE_URL}/bank/`
    return  axios.post(url, {
        nome,
        horariodeatendimento,
        telefone,
        cep,
        logradouro,
        numero,
        complemento,
        bairro,
        cidade,
        uf
    }).then(response => response.data);
}

const findAll  = ( nome, horariodeatendimento, telefone, cep, logradouro, numero, complemento, bairro, cidade, uf) => {
    const url = `${BASE_URL}/bank/`
    return  axios.get(url).then(response => response.data);
}

const remove  = (id) => {
    const url = `${BASE_URL}/bank/${id}/`
    return  axios.delete(url).then(response => response.data);
}
export {
    create,
    findAll,
    remove
}