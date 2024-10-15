package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AnimalDataDao {
    @Insert
    fun setInsertData(animalData: AnimalData) : Long

    @Update
    fun setUpdateData(animalData: AnimalData)

    @Delete
    fun setDelete(animalData: AnimalData)

    @Query("SELECT * FROM AnimalData")
    fun getDataAll():MutableList<AnimalData>
}