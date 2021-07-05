package com.laurentdarl.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.note.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    private fun saveNote(title: String, content: String) {
        
    }

}