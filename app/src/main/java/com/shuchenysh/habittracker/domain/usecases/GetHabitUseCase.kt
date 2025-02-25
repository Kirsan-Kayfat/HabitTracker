package com.shuchenysh.habittracker.domain.usecases

import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.repository.HabitRepository

class GetHabitUseCase(
    private val repository: HabitRepository
) {

    operator fun invoke(habitId: Int): Habit = repository.getHabit(habitId)
}