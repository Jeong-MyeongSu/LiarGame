package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FB2DataDao {
    @Insert
    fun setInsertData(fb2Data: FB2Data) : Long

    @Update
    fun setUpdateData(fb2Data:FB2Data)

    @Delete
    fun setDelete(fb2Data: FB2Data)

    @Query("SELECT * FROM Fb2Data")
    fun getDataAll():MutableList<FB2Data>
}