// SettingsActivity.java
// Activity to display SettingsActivityFragment on a phone
package edu.orangecoastcollege.flagquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.deitel.flagquiz.R;

/**
 * SettingsActivity is the activity to display a SettingsActivityFragment
 * on a landscape-oriented tablet.
 */
public class SettingsActivity extends AppCompatActivity {
   // inflates the GUI, displays Toolbar and adds "up" button
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_settings);
      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
   }
}

