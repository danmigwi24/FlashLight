package com.example.flashlightmine

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import kotlinx.android.synthetic.main.activity_main.*
import java.security.Permission
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    private var CAMERA_PERMISSION = 200
    private var flashlightstatus: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*textstatus.setText("OFF")

        btnAction!!.setOnClickListener {
            *//*val permission =
                ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (permission != PackageManager.PERMISSION_GRANTED) {
                    setupPermmision()
                } else {
                    openFlashlight()
                }*//*
                openFlashlight()
            }
        }

    }

   *//* private fun setupPermmision() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.CAMERA),
            CAMERA_PERMISSION
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }


    *//*

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun openFlashlight() {
        val cameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
        val cameraid = cameraManager.cameraIdList[0]
        if (!flashlightstatus) {
            try {
                cameraManager.setTorchMode(cameraid, true)
                textstatus.setText("ON")
                flashlightstatus=true
            } catch (e: CameraAccessException) {}
            else{
            try {
                cameraManager.setTorchMode(cameraid, false)
                textstatus.setText("ON")
                flashlightstatus=false
            } catch (e: CameraAccessException) {}

            }
        }*/

    }
}
