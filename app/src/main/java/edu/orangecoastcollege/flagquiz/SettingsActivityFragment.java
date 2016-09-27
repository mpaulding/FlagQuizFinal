// SettingsActivityFragment.java
// Subclass of PreferenceFragment for managing app settings
package edu.orangecoastcollege.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.deitel.flagquiz.R;

/**
 * SettingsActivityFragment is a subclass of PreferenceFragment for managing
 * the app settings, such as number of guesses and regions to select flags from.
 */
public class SettingsActivityFragment extends PreferenceFragment {
   // creates preferences GUI from preferences.xml file in res/xml
   @Override
   public void onCreate(Bundle bundle) {
      super.onCreate(bundle);
      addPreferencesFromResource(R.xml.preferences); // load from XML
   }
}

