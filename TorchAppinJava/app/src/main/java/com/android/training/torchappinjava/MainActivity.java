package com.android.training.torchappinjava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTorch;
    Boolean isTorchOn = false;
    Boolean isTorchAvailable;
    CameraManager cameraManager;
    String cameraId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTorch = (Button) findViewById(R.id.btn_torch);
        isTorchAvailable = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH); //verifica si tiene flash

        if (isTorchAvailable){
            btnTorch.setText("Torch is not available.");
        }
        try{
            cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            cameraId = cameraManager.getCameraIdList()[0];
        } catch(Exception e) {

        }

        //btnTorch.setOnClickListener(view -> { //lambda | new View.OnClickListener(){};
        btnTorch.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                switchTorch(isTorchOn);
                if (isTorchOn){
                    isTorchOn = false;
                    btnTorch.setText("Turn on torch.");
                } else {
                    isTorchOn = true;
                    btnTorch.setText("Turn off torch.");
                }
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void switchTorch(Boolean status){
        try{
            cameraManager.setTorchMode(cameraId, status);
        }catch (Exception e){

        }
    }

}