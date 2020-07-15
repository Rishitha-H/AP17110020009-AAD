package com.example.t4bmy_camera;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i;
    public static final int CAMERA_REQUEST_CODE = 20;
    public static final int Gallery_REQUEST_CODE = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.camera);
        Button b2=findViewById(R.id.gallery);
        i=findViewById(R.id.image);
    }

    public void OpenGallery(View view) {
        Intent intent= new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,Gallery_REQUEST_CODE);
    }

    public void OpenCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST_CODE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAMERA_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Bitmap b=(Bitmap) data.getExtras().get("data");
                i.setImageBitmap(b);
            }
        }
        if(requestCode==Gallery_REQUEST_CODE){
            if(resultCode==RESULT_OK){
                Uri u = data.getData();
                i.setImageURI(u);
            }
        }
    }
}
