package com.letastichi.AndroidSays.AndroidSaysMain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.letastichi.AndroidSays.R;

import java.util.logging.Handler;

public class LoadScreen extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_screen);

        if(savedInstanceState == null){
            Intent intent = new Intent(getApplicationContext(), MainMenu.class);
            startActivity(intent);
        }
    }
}
