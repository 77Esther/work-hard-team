package com.program.workhard;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("Þ±¶ù°¢ÓÑ");
        Button loginButton = (Button)findViewById(R.id.button2);
        loginButton.setOnClickListener(new LoginListener());
        
    }
    class LoginListener implements OnClickListener{
    	public void onClick(View v){
    		Intent loginIntent = new Intent();
    		loginIntent.setClass(Main.this, Login.class);
    		startActivity(loginIntent);
    	}
    }    
}
