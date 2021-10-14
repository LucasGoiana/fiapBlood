import React, {Component} from "react";
import {Form, FormGroup, Input, Label, Button, Col} from 'reactstrap'
import data from "bootstrap/js/src/dom/data";

class BankOfBloodAddComponent extends Component{

    constructor(props) {
        super(props);

        this.state = {
            nome:"",
            horariodeatendimento: "",
            telefone:"",
            cep:"",
            logradouro:"",
            numero:"",
            bairro:"",
            complemento:"",
            uf:"",
            cidade:""
        }
    }

    render() {
         function onBlurCep(ev){
             this.setState(
                 {
                     logradouro:'',
                     bairro: '',
                     uf:'',
                     cidade: ''
                 })

            const {value}  = ev.target;

            if(value?.length !== 8 ){
                alert('CEP Inválido!!!')
                return;
            }

            const cep = value.replace('/[^0-9]/g', '');
             fetch(`https://viacep.com.br/ws/${cep}/json/`)
                 .then(
                     //reponse
                     function(response) {

                        //defino a variaval json para poder usar o response.json() + de uma vez
                        var json = response.json();

                        //abaixo verifico se a api do viacep retorna error true
                        json.then(
                             function (data){
                                 var status = JSON.parse(JSON.stringify(data));
                                 if(status.erro == true){
                                     alert('CEP Inválido!!!')
                                     return;
                                 }
                             }
                        );

                       // caso passe na validação acima retorno o respose.json() como variavel json
                       return json;
                    }
                    // Abaixo seto o state de cada campo
                 ).then((data)=>this.setState({
                    logradouro: data.logradouro,
                    bairro: data.bairro,
                    uf:data.uf,
                    cidade: data.localidade
             }));

        }
        return(
            <Col>
                <Form>
                    <FormGroup>
                            <Label>Nome do Banco de Sangue</Label>
                            <Input type="text" name="name" placeholder="Digite o Nome"/>
                    </FormGroup>
                    <FormGroup>
                            <Label>Horário de Atendimento</Label>
                            <Input type="text" name="horario" placeholder="Digite o Horário de Atendimento"/>
                    </FormGroup>
                    <FormGroup>
                            <Label>Telefone</Label>
                            <Input type="text" name="telefone" placeholder="Digite o Telefone"/>
                    </FormGroup>
                    <FormGroup>
                        <Label>CEP</Label>
                        <Input type="text" name="cep" placeholder="Digite o CEP" onBlur = {onBlurCep.bind(this) }/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Logradouro</Label>
                        <Input disabled type="text" name="logradouro" value={this.state.logradouro} placeholder="Digite o Logradouro"/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Número</Label>
                        <Input type="text" name="telefone" placeholder="Digite o Número"/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Complemento</Label>
                        <Input  type="text" name="complemento" placeholder="Digite o Complemento"/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Bairro</Label>
                        <Input disabled type="text" name="bairro" value={this.state.bairro} placeholder="Digite o Bairro"/>
                    </FormGroup>
                    <FormGroup>
                        <label>Cidade</label>
                        <Input disabled type="text" name="cidade" value={this.state.cidade} placeholder="Digite a Cidade"/>
                    </FormGroup>
                    <FormGroup>
                        <Label>UF</Label>
                        <Input disabled type="text" name="uf"  value={this.state.uf} placeholder="Digite o UF"/>
                    </FormGroup>

                    <FormGroup>
                        <Button color="primary">Cadastrar</Button>
                    </FormGroup>
                </Form>
            </Col>
        );
    }
}

export default  BankOfBloodAddComponent;
