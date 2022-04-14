package com.stepanusryan.fetchdata_retrofit.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.stepanusryan.fetchdata_retrofit.home.MainActivity
import com.stepanusryan.fetchdata_retrofit.databinding.ActivitySplashscreenBinding

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivitySplashscreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this@SplashscreenActivity, MainActivity::class.java))
            finish()
        },2500L)
    }
}