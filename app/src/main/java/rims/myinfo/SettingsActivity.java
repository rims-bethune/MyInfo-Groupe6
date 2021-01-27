package rims.myinfo;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.settings, new SettingsFragment())
                    .commit();
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
    // verif
    // public static class TesterConnexionHTTP {

    // public static void main(String[] args) {

    //  try {
    //    String url = PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
    //    .getString("url","https://www.lemonde.fr/rss/une.xml");
    //    HttpURLConnection connexion = (HttpURLConnection)uneURL.openConnection();
    //       InputStream flux = connexion.getInputStream();
    //     System.out.println("Status de la connexion : " + connexion.getResponseMessage());
    //     int ch;
    //    if (connexion.getResponseCode() == HttpURLConnection.HTTP_OK)
    //        while ((ch=flux.read())!= -1)
    //        System.out.print((char) ch);
    //   flux.close();
    //      connexion.disconnect();
    //     }
    //    catch(Exception e) {
    //         System.out.println(e);
    //     }
    //     }
    //   }
}