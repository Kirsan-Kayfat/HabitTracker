package com.shuchenysh.habittracker.data.mapper

import com.shuchenysh.habittracker.data.database.HabitDbModel
import com.shuchenysh.habittracker.data.database.HabitEntryDbModel
import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.entity.HabitEntry

class HabitMapper {

    fun Habit.toHabitDbModel(entries: List<HabitEntryDbModel>): HabitDbModel = HabitDbModel(
        id = this.id,
        name = this.name,
        date = this.date,
        entries = entries
    )

    fun HabitDbModel.toHabit(): Habit = Habit(
        id = this.id,
        name = this.name,
        date = this.date
    )

    fun HabitEntry.toHabitEntryDbModel(): HabitEntryDbModel = HabitEntryDbModel(
        category = this.category,
        value = this.value,
        isChecked = this.isChecked
    )

    fun HabitEntryDbModel.toHabitEntry(habitId: Int, date: String): HabitEntry = HabitEntry(
        id = 0,
        habitId = habitId,
        category = this.category,
        value = this.value,
        isChecked = this.isChecked,
        date = date
    )
}