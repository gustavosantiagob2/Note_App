package com.example.note_app.core.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.note_app.core.theme.BabyBlue
import com.example.note_app.core.theme.LightGreen
import com.example.note_app.core.theme.RedOrange
import com.example.note_app.core.theme.RedPink
import com.example.note_app.core.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
