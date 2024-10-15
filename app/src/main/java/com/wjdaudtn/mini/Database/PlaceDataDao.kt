package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PlaceDataDao {
    @Insert
    fun setInsertData(placeData: PlaceData) : Long

    @Update
    fun setUpdateData(placeData: PlaceData)

    @Delete
    fun setDelete(placeData: PlaceData)

    @Query("SELECT * FROM PlaceData")
    fun getDataAll():MutableList<PlaceData>
}