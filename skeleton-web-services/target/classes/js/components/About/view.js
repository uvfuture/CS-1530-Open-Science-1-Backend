/** @jsx m */

'use strict';

let m = require('mithril'),
    BannerComponent = require('../Banner/Banner');

module.exports = function(ctrl) {
    return <div id = 'about' class='container-fluid'>
        <BannerComponent />
        <div class = 'main row'>
            <div class = 'inner'>
                <div class = 'content'>

                    <div>{ctrl.aboutParagraphs().map(function (paragraph) {
                        return <p> {paragraph} </p>
                    })}</div>
                </div>
            </div>
        </div>
    </div>;
};
