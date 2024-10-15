package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SingerDataDao {
    @Insert
    fun setInsertData(singerData: SingerData) : Long

    @Update
    fun setUpdateData(singerData: SingerData)

    @Delete
    fun setDelete(singerData: SingerData)

    @Query("SELECT * FROM SingerData")
    fun getDataAll():MutableList<SingerData>
}