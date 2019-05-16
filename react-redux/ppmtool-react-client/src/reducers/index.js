import { combineReducers } from "redux";
import errorReducer from "./errorReducer";
import projectReducer from "./projectReducer";
// combinereducers is used when multiple reducers are present

export default combineReducers({
  errors: errorReducer,
  project: projectReducer
});
