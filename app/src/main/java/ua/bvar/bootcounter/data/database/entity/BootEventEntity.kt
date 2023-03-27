package ua.bvar.bootcounter.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = BootEventEntity.TABLE_NAME)
internal data class BootEventEntity(
    @ColumnInfo(name = COLUMN_ID) @PrimaryKey val id: String,
    @ColumnInfo(name = COLUMN_TIMESTAMP) val timestamp: Long
) {
    companion object {
        const val TABLE_NAME = "boot_events"
        const val COLUMN_ID = "id"
        const val COLUMN_TIMESTAMP = "timestamp"
    }
}