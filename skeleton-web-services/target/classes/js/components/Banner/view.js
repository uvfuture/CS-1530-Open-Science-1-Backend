/** @jsx m */

'use strict';

let m = require('mithril'),
    LogoutComponent = require('../Logout/Logout');

module.exports = function(ctrl) {
    return <header class = {'row ' + ctrl.size()}>
        <div class={ctrl.size() === 'small' ?
            'col-xs-8'
            : 'col-xs-12'
        }>
            <a href = '/#/about'>
                <h1>{ctrl.name()}</h1>
            </a>
        </div>
        {ctrl.size() === 'small' ?
            <LogoutComponent />
        : null}
    </header>;
};
