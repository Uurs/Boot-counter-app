package ua.bvar.bootcounter.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ua.bvar.bootcounter.data.database.entity.BootEventEntity

@Dao
internal interface BootEventDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(entity: BootEventEntity)

    @Query("SELECT * FROM ${BootEventEntity.TABLE_NAME}")
    fun getAll(): List<BootEventEntity>
}