import React, {Component} from "react";
import {Col} from 'reactstrap'

class HomeComponent extends Component{
    constructor(props) {
        super(props)

        this.state = { isOpen : false}
        this.toggleNavbar = this.toggleNavbar.bind(this);
    }

    toggleNavbar(){
        return this.setState({
            isOpen: true
        });
    }
    render() {
        let { isOpen } = this.state
        return (
            <Col>
                <h1>FiapBlood</h1>
            </Col>
        );
    }

}

export default HomeComponent;