package com.wjdaudtn.mini.Database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [FBData::class, FB2Data::class, SingerData::class, StuffData::class, ActorData::class, PlaceData::class, AnimalData::class, FamousData::class, OldFBData::class, ManagerData::class, SportsData::class, FreeData::class], version = 3, exportSchema = false)
abstract class Database: RoomDatabase() {

    abstract fun fbDataDao():FBDataDao
    abstract fun fb2dataDao():FB2DataDao
    abstract fun SingerDataDao():SingerDataDao
    abstract fun stuffDataDao():StuffDataDao
    abstract fun actorDataDao():ActorDataDao
    abstract fun placeDataDao():PlaceDataDao
    abstract fun animalDataDao():AnimalDataDao
    abstract fun famousDataDao():FamousDataDao
    abstract fun oldFbDataDao():OldFBDataDao
    abstract fun managerDataDao():ManagerDataDao
    abstract fun sportsDataDao():SportsDataDao
    abstract fun freeDataDao():FreeDataDao

}