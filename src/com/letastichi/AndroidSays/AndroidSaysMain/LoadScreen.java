package com.letastichi.AndroidSays.AndroidSaysMain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.letastichi.AndroidSays.R;

public class LoadScreen extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_screen);

        if(savedInstanceState == null){
                new Handler().postDelayed(new Runnable(){
                    public void run(){
                        Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                        startActivity(intent);
                    }
                }, 2000);
        }
    }

    @Override
    public void onPause(){
        super.onPause();
        LoadScreen.this.finish();
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
