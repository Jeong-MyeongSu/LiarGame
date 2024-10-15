package com.wjdaudtn.mini.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StuffData(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var word:String = ""
)