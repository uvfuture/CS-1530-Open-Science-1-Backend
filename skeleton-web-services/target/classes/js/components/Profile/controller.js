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
    //TODO, no calls for now...
    /*
    ctrl.profileInfo(m.request({
        method: 'GET',
        url: remote.url + '/getCurrentUser',
        extract: remote.auth,
        config: function(xhr) {
            xhr.withCredentials = true;
        }
    }).then(function(res) {
        ctrl.profileInfo(res.user);
        return res;
    }));
    */
};
