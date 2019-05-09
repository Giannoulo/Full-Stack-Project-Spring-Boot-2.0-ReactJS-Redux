import { combineReducers } from "redux";
import errorReducer from "./errorReducer";
// combinereducers is used when multiple redicers are present

export default combineReducers({
  errors: errorReducer
});
