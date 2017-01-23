package Util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by rahma on 12/19/2016.
 */

public class Utils {
    public static final String BASE_URL="http://api.openweathermap.org/data/2.5/weather?q=";
    public static final String ICON_URL="http://api.openweathermap.org/img/w/";

    public static JSONObject getObject(String tagName,JSONObject jsonObject) throws JSONException
    {
        JSONObject jObj = jsonObject.getJSONObject(tagName);
        return jObj;
    }

    public static String getString(String tagNamne,JSONObject jsonObject)throws JSONException
    {
        return jsonObject.getString(tagNamne);
    }
    public static float getFloat(String tagName,JSONObject jsonObject)throws JSONException
    {
        return (float)jsonObject.getDouble(tagName);
    }
    public static double getDouble(String tagName,JSONObject jsonObject)throws JSONException
    {
        return (float)jsonObject.getDouble(tagName);
    }
    public static int getInt(String tagName, JSONObject jsonObject)throws JSONException
    {
        return jsonObject.getInt(tagName);
    }

}
