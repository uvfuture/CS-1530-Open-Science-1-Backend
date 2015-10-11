'use strict';

let m = require('mithril'),
    userId = m.prop(''),
    evaluateUserId = function() {
        if(!userId()) {
            m.request({
                method: 'GET',
                url: url + '/getCurrentUser',
                config: function(xhr) {
                    xhr.withCredentials = true;
                }
            }).then(function(res) {
                userId(res.user);
            }, function() {
                m.route('/login');
            });
        }
        return userId();
    },
    url;

module.exports.url = url = 'http://localhost:4000';

module.exports.userId = userId;

module.exports.auth = function(res, options) {
    evaluateUserId();

    if(res.status === 403) {
        //TODO: breadcrumb where the user left off
        m.route('/login');
        return res.status;
    }
    else {
        return res.response;
    }
}

