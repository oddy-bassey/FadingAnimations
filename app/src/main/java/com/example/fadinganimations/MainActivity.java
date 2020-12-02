package com.example.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isBartShowing = true;

    public void fadeImage(View view){
        Log.i("info" , "image has been clicked");

        ImageView bartImageView = (ImageView) findViewById(R.id.homerImage);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImage);

        if(isBartShowing){
            isBartShowing = false;

            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
        }else{
            isBartShowing = true;
            bartImageView.animate().alpha(1).setDuration(2000);
            homerImageView.animate().alpha(0).setDuration(2000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
