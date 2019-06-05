package com.example.studygradle_training

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var mAppNameTxt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAppNameTxt = findViewById(R.id.app_name_txt)

        // BuildConfig.URL_END_POINT is changed depend on build variants
        mAppNameTxt.text = BuildConfig.URL_END_POINT

        // my_color is auto gen at  resValue "color", "my_color", "#B495F5" in file build.gradle for module app
        mAppNameTxt.setTextColor(ContextCompat.getColor(this, R.color.my_color))

    }

}
