package ua.bvar.bootcounter.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ua.bvar.bootcounter.data.database.dao.BootEventDao
import ua.bvar.bootcounter.data.database.entity.BootEventEntity

@Database(entities = [BootEventEntity::class], version = 1)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun bootEventDao(): BootEventDao

    companion object {
        private const val DATABASE_NAME = "boot_counter_db"

        fun create(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
        }

    }
}