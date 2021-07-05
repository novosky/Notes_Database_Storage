package com.laurentdarl.note.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.laurentdarl.note.databinding.NoteItemsBinding
import com.laurentdarl.note.models.Note

class NoteAdapter(var context: Context, var notes: List<Note>): RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val binding = NoteItemsBinding.inflate(LayoutInflater.from(parent.context))
        return NoteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val notes = notes[position]
        holder.bind(notes)
    }

    override fun getItemCount(): Int {
        return notes.size
    }



    class NoteViewHolder(var items: NoteItemsBinding): RecyclerView.ViewHolder(items.root) {

        fun bind(note: Note) {
            items.tvTitle.text = note.title
            items.etDescriptions.text = note.content
            items.etName.text = note.id.toString()
        }
    }
}