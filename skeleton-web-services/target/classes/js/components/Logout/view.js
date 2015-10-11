/** @jsx m */

'use strict';

let m = require('mithril');

module.exports = function(ctrl) {
    return <div id = 'logout' class='col-xs-4'>
        <button onclick={ctrl.logout} class='btn white'>Logout</button>
    </div>;
};
