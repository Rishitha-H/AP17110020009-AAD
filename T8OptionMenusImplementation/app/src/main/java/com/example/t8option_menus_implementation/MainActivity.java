package com.example.t8option_menus_implementation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.s:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "Share"));
                return true;
            case R.id.d:
                Uri uri = Uri.parse("tel:1234567890");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
                return true;
            case R.id.g:
                Intent Intnt = new Intent();
                Intnt.setAction(Intent.ACTION_GET_CONTENT);
                Intnt.setType("image/*");
                startActivity(Intnt);
                return true;
            default:
                return false;
        }
    }
}