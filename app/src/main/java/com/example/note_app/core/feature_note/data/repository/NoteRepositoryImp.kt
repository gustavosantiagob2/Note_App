package com.example.note_app.core.feature_note.data.repository

import com.example.note_app.core.feature_note.data.data_source.NoteDao
import com.example.note_app.core.feature_note.domain.model.Note
import com.example.note_app.core.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImp(
    private val dao: NoteDao
): NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return deleteNote(note)
    }
}