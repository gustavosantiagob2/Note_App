package com.example.note_app.core.feature_note.presentation.notes

import com.example.note_app.core.feature_note.domain.model.Note
import com.example.note_app.core.feature_note.domain.util.NoteOrder

sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNotes(val note: Note ): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()

}