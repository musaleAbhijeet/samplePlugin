
// package org.apache.cordova.device;

// import java.util.TimeZone;

// import org.apache.cordova.CordovaWebView;
// import org.apache.cordova.CallbackContext;
// import org.apache.cordova.CordovaPlugin;
// import org.apache.cordova.CordovaInterface;
// import org.json.JSONArray;
// import org.json.JSONException;
// import org.json.JSONObject;

// import android.provider.Settings;

public class MyCordovaPlugin extends CordovaPlugin {
    public static final String TAG = "MyCordovaPlugin";

    // public static String platform;                            // Device OS
    // public static String uuid;                                // Device UUID

    // private static final String ANDROID_PLATFORM = "Android";
    // private static final String AMAZON_PLATFORM = "amazon-fireos";
    // private static final String AMAZON_DEVICE = "Amazon";

    // /**
    //  * Constructor.
    //  */
    // public Device() {
    // }

    /**
     * Sets the context of the Command. This can then be used to do things like
     * get file paths associated with the Activity.
    //  *

    //  */
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // Device.uuid = getUuid();
    }

    /**
     * Executes the request and returns PluginResult.
     *
   
     */
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(action)) {
           String phrase = args.getString(0);
        }
        else {
            return false;
        }
        return true;
    }

   
}
