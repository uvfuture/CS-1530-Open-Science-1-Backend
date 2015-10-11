'use strict';

let m = require('mithril'),
    model = require('./model');

module.exports = function(data) {
    let ctrl = this;
    //incoming model and data mutators/accessors
    for(var prop in model) {
        ctrl[prop] = m.prop(model[prop]);
    }
    for(var prop in data) {
        ctrl[prop] = m.prop(data[prop]);
    }
};
