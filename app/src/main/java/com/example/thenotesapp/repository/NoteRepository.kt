package com.example.thenotesapp.repository

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.thenotesapp.database.NoteDatabase
import com.example.thenotesapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDAO().insertNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDAO().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDAO().deleteNote(note)

    fun getAllNotes() = db.getNoteDAO().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDAO().searchNote(query)
}