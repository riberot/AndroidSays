package com.letastichi.AndroidSays.AndroidSaysMain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.letastichi.AndroidSays.R;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 3/11/13
 * Time: 8:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainMenu extends Activity {
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    public void startTheGame(View view){
        intent = new Intent(view.getContext(), GameScreen.class);
        startActivity(intent);
    }

    public void howToPlay(View view){
        intent = new Intent(view.getContext(), HelpScreen.class);
        startActivity(intent);
    }

    public void aboutTheGame(View view){
        intent = new Intent(view.getContext(), AboutScreen.class);
        startActivity(intent);
    }
}
