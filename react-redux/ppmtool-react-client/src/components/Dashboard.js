import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";
import { directive } from "@babel/types";

class Dashboard extends Component {
  render() {
    return (
      <div>
        <h1>Welcome to the Dashboard</h1>
        <ProjectItem />
        <ProjectItem />
        <ProjectItem />
      </div>
    );
  }
}

export default Dashboard;
