package com.wjdaudtn.mini.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class AnimalData(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var word:String = ""
)