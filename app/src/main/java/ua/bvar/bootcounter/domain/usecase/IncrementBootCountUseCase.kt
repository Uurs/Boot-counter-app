package ua.bvar.bootcounter.domain.usecase

interface IncrementBootCountUseCase {
    suspend fun execute()
}