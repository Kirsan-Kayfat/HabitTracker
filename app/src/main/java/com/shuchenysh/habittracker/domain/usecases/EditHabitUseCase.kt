package com.shuchenysh.habittracker.domain.usecases

import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.repository.HabitRepository

class EditHabitUseCase(
    private val repository: HabitRepository
) {

    operator fun invoke(habit: Habit) {
        repository.editHabit(habit)
    }
}