package com.laurentdarl.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laurentdarl.note.adapters.NoteAdapter
import com.laurentdarl.note.databinding.ActivityMainBinding
import com.laurentdarl.note.models.Note

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var noteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val note = listOf<Note>(Note(210, "The act of being strong", "What is Lorem " +
                "Ipsum Lorem Ipsum is simply dummy text of the printing and typesetting industry " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when " +
                "an unknown printer took a galley of type and scrambled it to make a type specimen " +
                "book it has?")
        )


        noteAdapter = NoteAdapter(this, note)
        binding.rvNoteHandling.adapter = noteAdapter
    }


    private fun saveNote(title: String, content: String) {
        
    }

}