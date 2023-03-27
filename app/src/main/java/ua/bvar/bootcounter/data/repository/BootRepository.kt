package ua.bvar.bootcounter.data.repository

import ua.bvar.bootcounter.domain.model.BootEvent

interface BootRepository {
    suspend fun saveBootEvent(bootEvent: BootEvent)
    suspend fun getBootEvents(): List<BootEvent>
}