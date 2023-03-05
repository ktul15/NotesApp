package com.example.pl_notes_app.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text : String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)