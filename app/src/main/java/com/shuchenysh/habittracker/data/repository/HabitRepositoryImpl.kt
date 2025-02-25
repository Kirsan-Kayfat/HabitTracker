package com.shuchenysh.habittracker.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.shuchenysh.habittracker.data.database.HabitDao
import com.shuchenysh.habittracker.data.mapper.HabitMapper
import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.repository.HabitRepository

class HabitRepositoryImpl(
    private val mapper: HabitMapper = HabitMapper(),
    private val habitDao: HabitDao,
    private val application: Application
) : HabitRepository {

    override fun addHabit(habit: Habit) {
        TODO("Not yet implemented")
    }

    override fun editHabit(habit: Habit) {
        TODO("Not yet implemented")
    }

    override fun getHabitList(): LiveData<List<Habit>> {
        TODO("Not yet implemented")
    }

    override fun getHabit(habitId: Int): Habit {
        TODO("Not yet implemented")
    }

    override fun removeHabit(habitId: Int) {
        TODO("Not yet implemented")
    }
}