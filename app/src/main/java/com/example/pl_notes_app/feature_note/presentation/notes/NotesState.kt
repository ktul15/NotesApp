package com.example.pl_notes_app.feature_note.presentation.notes

import com.example.pl_notes_app.feature_note.domain.model.Note
import com.example.pl_notes_app.feature_note.domain.util.NoteOrder
import com.example.pl_notes_app.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    var noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
