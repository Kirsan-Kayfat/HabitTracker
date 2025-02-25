package com.shuchenysh.habittracker.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shuchenysh.habittracker.domain.entity.Habit
import com.shuchenysh.habittracker.domain.entity.HabitEntry

@Dao
interface HabitDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addHabit(habit: Habit): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addHabitEntries(entries: List<HabitEntry>)

    @Query("SELECT * FROM HabitEntry WHERE habitId = :habitId")
    suspend fun getEntriesForHabit(habitId: Int): List<HabitEntry>

    @Query("SELECT SUM(value) FROM HabitEntry WHERE category = :category AND date BETWEEN :startDate AND :endDate")
    suspend fun getTotalForPeriod(category: String, startDate: String, endDate: String): Int?
}