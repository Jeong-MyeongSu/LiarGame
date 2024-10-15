package com.wjdaudtn.mini.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ManagerDataDao {
    @Insert
    fun setInsertData(managerData: ManagerData) : Long

    @Update
    fun setUpdateData(managerData: ManagerData)

    @Delete
    fun setDelete(managerData: ManagerData)

    @Query("SELECT * FROM ManagerData")
    fun getDataAll():MutableList<ManagerData>
}