package com.shuchenysh.habittracker.domain.usecases

import com.shuchenysh.habittracker.domain.repository.HabitRepository

class RemoveHabitUseCase(
    private val repository: HabitRepository
) {

    operator fun invoke(habitId: Int) {
        repository.removeHabit(habitId)
    }
}