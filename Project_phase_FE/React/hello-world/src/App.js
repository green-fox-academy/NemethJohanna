import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet'
import Welcome from './components/Welcome'
import Hello from './components/Hello'
import Message from './components/Message'
import Counter from './components/Counter'
import FunctionClick from './components/FunctionClick';
import ClassClick from './components/ClassClick';
import EventBind from './components/EventBind';
import ParentComponent from './components/ParentComponent';
import UserGreeting from './components/UserGreeting';

class App extends Component {
  render() {
    return (
      <div className="App">
        <UserGreeting></UserGreeting>
        {/* <ParentComponent></ParentComponent> */}
        {/* <EventBind></EventBind> */}
        {/* <FunctionClick></FunctionClick> */}
        {/* <ClassClick></ClassClick> */}
        {/* <Message /> */}
        {/* <Greet name="Bruce" heroName="Batman" >
            <p>This is children props</p>
          </Greet> */}
        {/* <Greet name="Diana" heroName="WonderWoman">
            <button>Action</button>
            </Greet>
          <Greet name="JOhn" heroName="superMan"/> */}
        {/* <Welcome name="Bruce" heroName="Batman" /> */}
        {/* <Welcome name="Diana" heroName="WonderWoman" />
          <Welcome name="JOhn" heroName="superMan" /> */}
      </div>
    );
  }
}

export default App
