package com.cursokotlin.todoapp.addtasks.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert
    suspend fun addTask(item:TaskEntity)
    @Query("SELECT * from TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>


}