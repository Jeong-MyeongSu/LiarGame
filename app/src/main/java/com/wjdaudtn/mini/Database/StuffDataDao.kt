package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface StuffDataDao {
    @Insert
    fun setInsertData(stuffData: StuffData) : Long

    @Update
    fun setUpdateData(stuffData: StuffData)

    @Delete
    fun setDelete(stuffData: StuffData)

    @Query("SELECT * FROM StuffData")
    fun getDataAll():MutableList<StuffData>
}