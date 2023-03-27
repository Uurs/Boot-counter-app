package ua.bvar.bootcounter.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ua.bvar.bootcounter.domain.usecase.GetAllBootEventsUseCase
import ua.bvar.bootcounter.domain.usecase.IncrementBootCountUseCase
import ua.bvar.bootcounter.domain.usecase.impl.GetAllBootEventsUseCaseImpl
import ua.bvar.bootcounter.domain.usecase.impl.IncrementBootCountUseCaseImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface UseCaseModule {

    @Binds
    fun bindIncrementBootCountUseCase(impl: IncrementBootCountUseCaseImpl): IncrementBootCountUseCase

    @Binds
    fun bindGetAllBootEventsUseCase(impl: GetAllBootEventsUseCaseImpl): GetAllBootEventsUseCase
}