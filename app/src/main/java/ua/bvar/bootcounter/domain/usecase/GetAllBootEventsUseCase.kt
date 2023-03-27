package ua.bvar.bootcounter.domain.usecase

import ua.bvar.bootcounter.domain.model.BootEvent

interface GetAllBootEventsUseCase {

    suspend fun execute(): List<BootEvent>
}