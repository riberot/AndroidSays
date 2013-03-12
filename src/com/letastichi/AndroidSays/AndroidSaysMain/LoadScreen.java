package com.letastichi.AndroidSays.AndroidSaysMain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.letastichi.AndroidSays.R;

public class LoadScreen extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Intent intent = new Intent(getApplicationContext(), MainMenu.class);
        startActivity(intent);
    }
}
