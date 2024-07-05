package com.example.note_app.core.feature_note.domain.util

sealed class OrderType {

    data object Ascending: OrderType()
    data object Descending: OrderType()

}