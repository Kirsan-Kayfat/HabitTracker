package com.shuchenysh.habittracker.data.database

data class HabitDbModel(
    val id: Int,
    val name: String,
    val date: String,
    val entries: List<HabitEntryDbModel>
)

data class HabitEntryDbModel(
    val category: String?,
    val value: Int?,
    val isChecked: Boolean?
)