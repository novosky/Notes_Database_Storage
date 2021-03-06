package com.laurentdarl.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.note.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private  lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}