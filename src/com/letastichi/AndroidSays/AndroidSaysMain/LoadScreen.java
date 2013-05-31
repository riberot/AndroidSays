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
        System.out.println("This is to check get Application: " + getApplicationContext());
        System.out.println("This is to check Class name: " + MainMenu.class);
        System.out.println("This is to check Intent: " + intent);
        System.out.println("This is to check middle of the Intent");
        startActivity(intent);
        System.out.println("This is to check end the Intent");
    }
}
