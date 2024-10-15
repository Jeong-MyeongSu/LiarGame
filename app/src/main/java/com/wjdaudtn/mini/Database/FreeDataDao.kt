package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FreeDataDao {
    @Insert
    fun setInsertData(freeData: FreeData) : Long

    @Update
    fun setUpdateData(freeData: FreeData)

    @Delete
    fun setDelete(freeData: FreeData)

    @Query("SELECT * FROM FreeData")
    fun getDataAll():MutableList<FreeData>
}