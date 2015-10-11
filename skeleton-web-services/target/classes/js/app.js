'use strict';

//es6 pollyfill
require('babelify/polyfill');

let m = require('mithril'),
    router = require('./router');

//router
m.route.mode = 'hash';
m.route(document.body.getElementsByTagName('main')[0], "/", router);
