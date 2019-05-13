import { combineReducers } from "redux";
import errorReducer from "./errorReducer";
// combinereducers is used when multiple reducers are present

export default combineReducers({
  errors: errorReducer
});
