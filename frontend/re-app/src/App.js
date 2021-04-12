import React from "react";
import { HashRouter, Route } from "react-router-dom";
import SignInSide from "./Component/SignInSide";

function App(){

        return (
            <HashRouter>
                <Route exact={true} path="/login" component={SignInSide} />
            </HashRouter>
            
        )
    
}

export default App;