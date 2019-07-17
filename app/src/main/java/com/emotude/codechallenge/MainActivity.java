package com.emotude.codechallenge;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button about;
   private Button profile ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        about = findViewById(R.id.button_about_alc);
        about.setOnClickListener(this);
        profile = findViewById(R.id.button_my_profile);
        profile.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId() ) {
            case R.id.button_about_alc:
                Intent myIntent = new Intent(MainActivity.this, AboutALC.class);
                startActivity(myIntent);
                break;
            case R.id.button_my_profile:
                Intent Intent = new Intent(MainActivity.this, MyProfile.class);
                startActivity(Intent);
                break;





            //   if (view.getId() == R.id.button_my_profile) {
            //     Intent Intent = new Intent(MainActivity.this, MyProfile.class);
            //   startActivity(Intent);

           /* if (view.getId() == R.id.button_my_profile) {
                Intent Intent = new Intent(MainActivity.this,MyProfile.class);
                startActivity(Intent);

            //  public void onClickProfile(View view) {
            //    if (view.getId() == R.id.button_my_profile) {
            //      Intent Intent = new Intent(MainActivity.this, MyProfile.class);
            //      startActivity(Intent);

           /* if (view.getId() == R.id.button_my_profile) {
                Intent Intent = new Intent(MainActivity.this,MyProfile.class);
                startActivity(Intent);

            }
            */
            //Log.d(TAG, "onClick: click about ALC");


        }
    }
}

