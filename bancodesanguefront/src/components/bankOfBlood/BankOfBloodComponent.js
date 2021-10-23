import React, {Component} from "react";
import {Button} from 'reactstrap';

class BankOfBloodComponent extends Component{
    constructor(props) {
        super(props);
    }

    render() {
        return(
            <div >
                <Button href="/bankOfBlood/add" color="primary">+ Banco de Sangue</Button>
            </div>
        );
    }
}

export default  BankOfBloodComponent;
