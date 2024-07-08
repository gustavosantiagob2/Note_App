package com.example.note_app.core.feature_note.domain.util

sealed class Screen(
    val route: String
){
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}