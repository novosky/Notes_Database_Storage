package com.laurentdarl.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.note.databinding.ActivityNoteDetailsactivityBinding

class NoteDetailsactivity : AppCompatActivity() {

    private lateinit var binding: ActivityNoteDetailsactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteDetailsactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}