package com.sudhirtheindian4.createyourownlibrarygithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sudhirtheindian4.tostshowlibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.simpleToast(this,"How are you This is for testing for creating your library");
    }
}