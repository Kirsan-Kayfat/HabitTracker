package com.shuchenysh.habittracker.domain.repository

import androidx.lifecycle.LiveData
import com.shuchenysh.habittracker.domain.entity.Habit

interface HabitRepository {

    fun addHabit(habit: Habit)

    fun editHabit(habit: Habit)

    fun getHabitList(): LiveData<List<Habit>>

    fun getHabit(habitId: Int): Habit

    fun removeHabit(habitId: Int)
}