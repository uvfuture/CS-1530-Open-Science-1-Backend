'use strict';

let m = require('mithril'),
    remote = require('./remote'),
    AboutComponent = require('./components/About/About'),
    ErrorComponent = require('./components/Error/Error'),
    LoginComponent = require('./components/Login/Login'),
    ProfileComponent = require('./components/Profile/Profile');

function verify() {
    //
}

module.exports = {
    "/": {
        controller: function () {
            if(remote.userID) {
                m.route('/profile/:' + remote.userID());
            }
            else {
                m.route('/login');
            }
        }
    },
    "/about": AboutComponent,
    "/error": ErrorComponent,
    "/login": LoginComponent,
    "/profile": ProfileComponent
};
