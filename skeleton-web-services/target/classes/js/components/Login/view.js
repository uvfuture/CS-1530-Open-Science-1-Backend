/** @jsx m */

'use strict';

let m = require('mithril'),
    BannerComponent = require('../Banner/Banner');

module.exports = function(ctrl) {
    return <div id = 'login' class='container-fluid'>
        <BannerComponent size='large' />
        <div class = 'main row'>
            <div class = 'inner'>
                <div class = 'content'>
                    <h2>Login:</h2>
                    <label for = 'email'>Email: </label>
                    <input type = 'text' name = 'email' id = 'email' value = {ctrl.email()} onchange = {m.withAttr('value', ctrl.email)} />
                    <label for = 'password'>Password: </label>
                    <input type = 'password' name = 'password' id = 'password' value = {ctrl.password()}  onchange = {m.withAttr('value', ctrl.password)} />
                    <div class = 'button-div'>
                        <button type='button' class='btn orange' onclick={ctrl.login}>Log in!</button>
                    </div>
                    <p class = 'tooltip'>{ctrl.loginMessage()}</p>
                </div>
            </div>
        </div>
    </div>;
};
