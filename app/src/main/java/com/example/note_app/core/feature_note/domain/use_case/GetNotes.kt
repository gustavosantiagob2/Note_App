package com.example.note_app.core.feature_note.domain.use_case

import com.example.note_app.core.feature_note.domain.model.Note
import com.example.note_app.core.feature_note.domain.repository.NoteRepository
import com.example.note_app.core.feature_note.domain.util.NoteOrder
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository:NoteRepository
) {

    operator fun invoke(
        noteOrder: NoteOrder = Note
    ): Flow<List<Note>> {

    }


}