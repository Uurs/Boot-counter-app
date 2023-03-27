package ua.bvar.bootcounter.data.repository

import ua.bvar.bootcounter.data.database.dao.BootEventDao
import ua.bvar.bootcounter.data.database.entity.BootEventEntity
import ua.bvar.bootcounter.domain.model.BootEvent
import javax.inject.Inject

internal class BootRepositoryImpl @Inject constructor(
    private val bootEventDao: BootEventDao
) : BootRepository {
    override suspend fun saveBootEvent(bootEvent: BootEvent) {
        return bootEventDao.save(BootEventEntity(bootEvent.id, bootEvent.timestamp))
    }

    override suspend fun getBootEvents(): List<BootEvent> {
        return bootEventDao.getAll().map { BootEvent(it.id, it.timestamp) }
    }
}