package com.shuchenysh.habittracker.domain.usecases

import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.repository.HabitRepository

class AddHabitUseCase(
    private val repository: HabitRepository
) {

    operator fun invoke(habit: Habit) {
        repository.addHabit(habit)
    }
}