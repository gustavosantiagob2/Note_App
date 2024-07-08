package com.example.note_app.core.feature_note.presentation.notes

import com.example.note_app.core.feature_note.domain.model.Note
import com.example.note_app.core.feature_note.domain.util.NoteOrder
import com.example.note_app.core.feature_note.domain.util.OrderType

data class NotesState(
    val note: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
