package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FamousDataDao {
    @Insert
    fun setInsertData(famousData: FamousData) : Long

    @Update
    fun setUpdateData(famousData: FamousData)

    @Delete
    fun setDelete(famousData: FamousData)

    @Query("SELECT * FROM FamousData")
    fun getDataAll():MutableList<FamousData>
}