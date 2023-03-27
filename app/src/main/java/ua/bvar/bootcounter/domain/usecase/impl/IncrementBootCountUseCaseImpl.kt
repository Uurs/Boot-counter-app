package ua.bvar.bootcounter.domain.usecase.impl

import ua.bvar.bootcounter.data.repository.BootRepository
import ua.bvar.bootcounter.domain.model.BootEvent
import ua.bvar.bootcounter.domain.usecase.IncrementBootCountUseCase
import java.util.UUID
import javax.inject.Inject

internal class IncrementBootCountUseCaseImpl @Inject constructor(
    private val bootRepository: BootRepository
) : IncrementBootCountUseCase {

    override suspend  fun execute() {
        bootRepository.saveBootEvent(
            BootEvent(
                id = UUID.randomUUID().toString(),
                timestamp = System.currentTimeMillis()
            )
        )
    }
}