


var exec = require('cordova/exec');

var PLUGIN_NAME = 'MyCordovaPlugin' 

var MyCordovaPlugin = {
    echo :function(phrase , cb){
        exec(cb , PLUGIN_NAME , 'echo' , [phrase])
    }
}
module.exports = MyCordovaPlugin;
