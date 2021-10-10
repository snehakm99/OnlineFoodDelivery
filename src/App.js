import "./App.css";
import Home from "./component/home";
import Item from "./component/item";
import addItem from "./component/addItem";
import Login from "./component/login";
import Register from "./component/register";
import "bootstrap/dist/css/bootstrap.css";
import Nav from "./component/nav";
import { Switch, Route, Redirect } from "react-router-dom";



// Functional Component & class components
// JSX - Javascript extention
function App() {
  return (
    // JSX syntax
    <div className="App">
      <Nav />
      <Switch>
        <Route exact path="/" component={Home} />
        <Route exact path="/" component={Item} />
        <Route path="/login" component={Login} />
        <Route exact path="/register" component={Register} />
        <Redirect from="/home" to="/" />
      </Switch>
    </div>
  );
}

export default App;