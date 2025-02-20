package com.example.thenotesapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "NOTES")
@Parcelize
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String
): Parcelable