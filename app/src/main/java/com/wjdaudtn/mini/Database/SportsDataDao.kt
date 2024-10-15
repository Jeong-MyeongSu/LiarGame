package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SportsDataDao {
    @Insert
    fun setInsertData(sportsData: SportsData) : Long

    @Update
    fun setUpdateData(sportsData: SportsData)

    @Delete
    fun setDelete(sportsData: SportsData)

    @Query("SELECT * FROM SportsData")
    fun getDataAll():MutableList<SportsData>
}