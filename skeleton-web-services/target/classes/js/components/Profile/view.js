/** @jsx m */

'use strict';

let m = require('mithril'),
    BannerComponent = require('../Banner/Banner');

module.exports = function(ctrl) {
    return <div id = 'profile'class='container-fluid'>
        <BannerComponent />
        <div class = 'main row'>
            <div class = 'inner'>
                <div class = 'content'>
                    <h2>Welcome: {ctrl.profileInfo().name}</h2>
                    <p>This is the profile page.</p>
                </div>
            </div>
        </div>
    </div>;
};
