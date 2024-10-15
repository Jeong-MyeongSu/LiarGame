package com.wjdaudtn.mini.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FB2Data (
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var word:String = ""
)