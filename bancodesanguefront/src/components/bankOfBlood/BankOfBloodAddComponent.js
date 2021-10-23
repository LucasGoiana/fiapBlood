import React, {Component} from "react";
import {Form, FormGroup, Input, Label, Button, Col} from 'reactstrap'
import {create} from "./BankOfBloodApi";

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

        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleBankOfBloodName = this.handleBankOfBloodName.bind(this);
        this.handleBankOfBloodAtendimento = this.handleBankOfBloodAtendimento.bind(this);
        this.handleBankOfBloodTelefone = this.handleBankOfBloodTelefone.bind(this);
        this.handleBankOfBloodCEP = this.handleBankOfBloodCEP.bind(this);
        this.handleBankOfBloodLogradouro = this.handleBankOfBloodLogradouro.bind(this);
        this.handleBankOfBloodNumero = this.handleBankOfBloodNumero.bind(this);
        this.handleBankOfBloodComplemento = this.handleBankOfBloodComplemento.bind(this);
        this.handleBankOfBloodUF = this.handleBankOfBloodUF.bind(this);
        this.handleBankOfBloodCidade = this.handleBankOfBloodCidade.bind(this);
    }

    handleBankOfBloodName(e){
       return this.setState({
            nome: e.target.value
        });
    }

    handleBankOfBloodAtendimento(e){
        return this.setState({
            horariodeatendimento: e.target.value
        });
    }

    handleBankOfBloodTelefone(e){
        return this.setState({
            telefone: e.target.value
        });
    }

    handleBankOfBloodCEP(e){
        return this.setState({
            cep: e.target.value
        });
    }

    handleBankOfBloodLogradouro(e){
        return this.setState({
            logradouro: e.target.value
        });
    }

    handleBankOfBloodNumero(e) {
        return this.setState({
            numero: e.target.value
        });
    }

    handleBankOfBloodComplemento(e){
        return this.setState({
            complemento: e.target.value
        });
    }

    handleBankOfBloodUF(e) {
        return this.setState({
           uf: e.target.value
        });
    }

    handleBankOfBloodCidade(e){
        return this.setState({
            cidade: e.target.value
        })
    }

    handleSubmit() {
        let { nome, horariodeatendimento, telefone, cep, logradouro, numero, complemento, bairro, cidade, uf } = this.state
        console.log(nome)
        create(nome, horariodeatendimento, telefone, cep, logradouro, numero, complemento, bairro, cidade, uf).then(
            () => {
               this.props.history.push('/bankOfBlood')
            }
        )
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
                            <Input type="text" name="nome" placeholder="Digite o Nome" onChange={this.handleBankOfBloodName}/>
                    </FormGroup>
                    <FormGroup>
                            <Label>Horário de Atendimento</Label>
                            <Input type="text" name="horariodeatendimento" placeholder="Digite o Horário de Atendimento" onChange={this.handleBankOfBloodAtendimento}/>
                    </FormGroup>
                    <FormGroup>
                            <Label>Telefone</Label>
                            <Input type="text" name="telefone" placeholder="Digite o Telefone" onChange={this.handleBankOfBloodTelefone}/>
                    </FormGroup>
                    <FormGroup>
                        <Label>CEP</Label>
                        <Input type="text" name="cep" placeholder="Digite o CEP" onBlur = {onBlurCep.bind(this) } onChange={this.handleBankOfBloodCEP}/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Logradouro</Label>
                        <Input disabled type="text" name="logradouro" value={this.state.logradouro} onChange={this.handleBankOfBloodLogradouro} placeholder="Digite o Logradouro"/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Número</Label>
                        <Input type="text" name="numero" placeholder="Digite o Número" onChange = {this.handleBankOfBloodNumero}/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Complemento</Label>
                        <Input  type="text" name="complemento" placeholder="Digite o Complemento" onChange = {this.handleBankOfBloodComplemento}/>
                    </FormGroup>
                    <FormGroup>
                        <Label>Bairro</Label>
                        <Input disabled type="text" name="bairro" value={this.state.bairro} placeholder="Digite o Bairro" onChange = {this.handleBankOfBloodBairro}/>
                    </FormGroup>
                    <FormGroup>
                        <label>Cidade</label>
                        <Input disabled type="text" name="cidade" value={this.state.cidade} placeholder="Digite a Cidade" onChange = {this.handleBankOfBloodCidade} />
                    </FormGroup>
                    <FormGroup>
                        <Label>UF</Label>
                        <Input disabled type="text" name="uf"  value={this.state.uf} placeholder="Digite o UF" onChange = {this.handleBankOfBloodUF}/>
                    </FormGroup>

                    <FormGroup>
                        <Button color="primary" onClick={this.handleSubmit}>Cadastrar</Button>
                    </FormGroup>
                </Form>
            </Col>
        );
    }
}

export default  BankOfBloodAddComponent;
