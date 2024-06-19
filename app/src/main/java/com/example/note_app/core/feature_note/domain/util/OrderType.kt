package com.example.note_app.core.feature_note.domain.util

sealed class OrderType {

    object Ascending: OrderType()
    object Descending: OrderType()

}