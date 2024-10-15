package com.wjdaudtn.mini.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ActorData(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var word:String = ""
)