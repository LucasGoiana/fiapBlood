import React, {Component} from "react";
import {Button, Col, Table} from 'reactstrap';
import {Link} from "react-router-dom";
import {findAll, remove} from "./BankOfBloodApi";


class BankOfBloodComponent extends Component{
    constructor(props) {
        super(props);

        this.state = { bankOfBlood: [] }
        this.handleDelete = this.handleDelete.bind(this);
    }

    componentDidMount() {
        findAll().then( data => this.setState({ bankOfBlood: data }))

    }

    handleDelete(bankOfBlood){
        remove(bankOfBlood.id).then( () =>{
            return findAll().then( data => this.setState({ bankOfBlood: data }))
        })
    }

    render() {
         let { bankOfBlood } = this.state
        return(
            <>
                <Col xs="12" sm="12" md="12">
                        <Link to="/bankOfBlood/add" className="alinha btn btn-primary">+ Banco de Sangue</Link>
                </Col>
                 <Col xs="12" sm="12" md="12">
                    <Table>
                        <thead>
                            <tr>
                                <th>
                                    Nome
                                </th>
                                <th>
                                    Horário de Atendimento
                                </th>
                                <th>
                                    Ações
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                        {bankOfBlood.map((bankOfBlood, index) => (
                            <tr>
                                <td>
                                    {bankOfBlood.nome}
                                </td>
                                <td>
                                    {bankOfBlood.horariodeatendimento}
                                </td>
                                <td>
                                    <Button color = "warning" onClick={ () => this.handleDelete(bankOfBlood)}> Edit </Button>
                                    <Button color = "danger" onClick={ () => this.handleDelete(bankOfBlood)}> Delete </Button>
                                </td>

                            </tr>
                            ))}

                        </tbody>
                    </Table>
                </Col>
            </>
        );
    }
}

export default  BankOfBloodComponent;
