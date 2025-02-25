package com.shuchenysh.habittracker.domain.usecases

import androidx.lifecycle.LiveData
import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.repository.HabitRepository

class GetHabitListUseCase(
    private val repository: HabitRepository
) {

    operator fun invoke(): LiveData<List<Habit>> = repository.getHabitList()
}