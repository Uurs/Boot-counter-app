package ua.bvar.bootcounter.domain.usecase.impl

import ua.bvar.bootcounter.data.repository.BootRepository
import ua.bvar.bootcounter.domain.model.BootEvent
import ua.bvar.bootcounter.domain.usecase.GetAllBootEventsUseCase
import javax.inject.Inject

internal class GetAllBootEventsUseCaseImpl @Inject constructor(
    private val bootRepository: BootRepository
) : GetAllBootEventsUseCase {

    override suspend  fun execute(): List<BootEvent> {
        return bootRepository.getBootEvents()
    }
}