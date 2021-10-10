import { combineReducers } from "redux";
import LoginReducer from "./loginReducer";

const RootReducer = combineReducers({
  counter: CounterReducer,
  fakeStore: productsReducer,
  login: LoginReducer,
});

export default RootReducer;