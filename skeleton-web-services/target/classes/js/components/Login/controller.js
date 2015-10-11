'use strict';

let m = require('mithril'),
    model = require('./model'),
    remote = require('../../remote');

module.exports = function(data) {
    let ctrl = this;
    //incoming model and data mutators/accessors
    for(var prop in model) {
        ctrl[prop] = m.prop(model[prop]);
    }
    for(var prop in data) {
        ctrl[prop] = m.prop(data[prop]);
    }
    ctrl.login = function() {
        m.route('/profile');
    //TODO: no auth for now...
    /*
        m.request({
            method: 'POST',
            url: remote.url + '/login',
            data: {
                email: ctrl.email(),
                password: ctrl.password()
            },
            config: function(xhr) {
                xhr.withCredentials = true;
            }
        }).then(function(res) {
            remote.userId(res.user.id);
            m.route('/profile');
        }, function(res) {
            if(500 < res.status > 400) {
                ctrl.loginMessage('That email and password combination does not match.');
            }
            else {
                ctrl.loginMessage('A server error occured. Sorry about that.');
            }
        });
    */
    }
};
