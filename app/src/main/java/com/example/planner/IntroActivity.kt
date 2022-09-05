package com.example.planner

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.annotation.RequiresApi
import android.view.WindowInsets
import android.view.WindowManager

class IntroActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        window.insetsController?.hide(WindowInsets.Type.statusBars())
        supportActionBar?.hide();

        Handler(Looper.getMainLooper()).postDelayed(
            {

                // Start the Intro Activity
                startActivity(Intent(this@IntroActivity, IntroLoginActivity::class.java))

                // Call this when your activity is done and should be closed.
                finish()

            },
            2500
        )
    }
}