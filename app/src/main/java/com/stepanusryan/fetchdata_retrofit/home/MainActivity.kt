package com.stepanusryan.fetchdata_retrofit.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stepanusryan.fetchdata_retrofit.databinding.ActivityMainBinding
import com.stepanusryan.fetchdata_retrofit.home.data1.Data1Activity
import com.stepanusryan.fetchdata_retrofit.home.data2.Data2Activity
import com.stepanusryan.fetchdata_retrofit.home.data3.Data3Activity
import com.stepanusryan.fetchdata_retrofit.home.data4.Data4Activity
import com.stepanusryan.fetchdata_retrofit.home.data5.Data5Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            startActivity(Intent(this@MainActivity, Data1Activity::class.java))
        }
        binding.btn2.setOnClickListener {
            startActivity(Intent(this@MainActivity, Data2Activity::class.java))
        }
        binding.btn3.setOnClickListener {
            startActivity(Intent(this@MainActivity, Data3Activity::class.java))
        }
        binding.btn4.setOnClickListener {
            startActivity(Intent(this@MainActivity, Data4Activity::class.java))
        }
        binding.btn5.setOnClickListener {
            startActivity(Intent(this@MainActivity, Data5Activity::class.java))
        }
//        binding.btn6.setOnClickListener {
//            startActivity(Intent(this@MainActivity, Data6Activity::class.java))
//        }
    }
}