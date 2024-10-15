package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ActorDataDao {
    @Insert
    fun setInsertData(actorData: ActorData) : Long

    @Update
    fun setUpdateData(actorData: ActorData)

    @Delete
    fun setDelete(actorData: ActorData)

    @Query("SELECT * FROM ActorData")
    fun getDataAll():MutableList<ActorData>
}