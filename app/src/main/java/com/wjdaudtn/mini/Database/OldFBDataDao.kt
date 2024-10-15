package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface OldFBDataDao {
    @Insert
    fun setInsertData(oldFBData: OldFBData) : Long

    @Update
    fun setUpdateData(oldFBData: OldFBData)

    @Delete
    fun setDelete(oldFBData: OldFBData)

    @Query("SELECT * FROM OldFBData")
    fun getDataAll():MutableList<OldFBData>
}