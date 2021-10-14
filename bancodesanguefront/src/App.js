import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import { BrowserRouter as Router, Route, Redirect} from 'react-router-dom';
import { Component } from 'react';
import {Container, Row} from "reactstrap";
import HomeComponent from './components/home/HomeComponent';
import HeaderComponent from "./components/header/HeaderComponent";
import BankOfBloodComponent from "./components/bankOfBlood/BankOfBloodComponent";
import BankOfBloodAddComponent from "./components/bankOfBlood/BankOfBloodAddComponent";
class App extends Component  {
 
  constructor (props) {
    super(props)
  }
 
  render() {
    return (
       <main>
             <HeaderComponent></HeaderComponent>
             <Router>
                <Container>
                   <Row>
                     <Route exact path="/" component={HomeComponent}></Route>

                     <Route exact path="/bankOfBlood/"component={BankOfBloodComponent}></Route>
                        <Route  path="/bankOfBlood/add" component={BankOfBloodAddComponent}></Route>
                   </Row>
                </Container>
             </Router>
       </main>


    );
   }
  
}

export default App;
