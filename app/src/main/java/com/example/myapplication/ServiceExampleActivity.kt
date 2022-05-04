package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityServiceExampleBinding

class ServiceExampleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityServiceExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_example)
        startService(Intent(this, MyService::class.java))
        binding.button3.setOnClickListener {
            val intent = Intent(this, ReceiverExampleActivity::class.java)
            startActivity(intent)
        }
    }
}