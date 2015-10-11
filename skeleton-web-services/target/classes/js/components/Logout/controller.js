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
    //TODO: No logout for now...
    /*
    ctrl.logout = function() {
        m.request({
            method: "GET",
            url: remote.url + '/logout',
            config: function(xhr) {
                xhr.withCredentials = true;
            },
            extract: remote.auth,
            }).then(function() {
                remote.userId('');
                m.route('/login');
            }, ctrl.logoutMessage('A server error occured. Sorry about that.'));
    }
    */
};
