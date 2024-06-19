package com.example.note_app.core.feature_note.domain.util

sealed class NoteOrder(orderType: OrderType) {

    class Title(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)


}