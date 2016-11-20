import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

class Settings extends Activity {

    /*====================================================================================================
    * Variables
    * ==================================================================================================*/
    public static final String PREFS_NAME = "Settings";
    
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    /*====================================================================================================
    * Initiate
    * ==================================================================================================*/
    Settings(Context context) {
        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();
    }

    /*====================================================================================================
    * Get
    * ==================================================================================================*/
    public Boolean getBool(String id) {
        return settings.getBoolean(id, true);
    }

    public Float getFloat(String id) {
        return settings.getFloat(id, 0);
    }

    public int getInt(String id) {
        return settings.getInt(id, 0);
    }

    public Long getLong(String id) {
        return settings.getLong(id, 0);
    }

    public String getString(String id) {
        return settings.getString(id, "");
    }

    public Set<String> getStringSet(String id) {
        return settings.getStringSet(id, null);
    }

    /*====================================================================================================
    * Set
    * ==================================================================================================*/
    public void setBool(String id, Boolean val) {
        editor.putBoolean(id, val);
        editor.commit();
    }

    public void setFloat(String id, Float val) {
        editor.putFloat(id, val);
        editor.commit();
    }

    public void setInt(String id, int val) {
        editor.putInt(id, val);
        editor.commit();
    }

    public void setLong(String id, Long val) {
        editor.putLong(id, val);
        editor.commit();
    }

    public void setString(String id, String val) {
        editor.putString(id, val);
        editor.commit();
    }

    public void setStringSet(String id, Set<String> val) {
        editor.putStringSet(id, val);
        editor.commit();
    }

}
