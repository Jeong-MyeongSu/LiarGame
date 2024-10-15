package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FBDataDao {
    @Insert
    fun setInsertData(fBData: FBData) : Long

    @Update
    fun setUpdateData(fBData:FBData)

    @Delete
    fun setDelete(fBData: FBData)

    @Query("SELECT * FROM Fbdata")
    fun getDataAll(): List<FBData>
}