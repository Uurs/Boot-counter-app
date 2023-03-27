package ua.bvar.bootcounter.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ua.bvar.bootcounter.data.repository.BootRepository
import ua.bvar.bootcounter.data.repository.BootRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface RepositoryModule {

    @Binds
    fun bindBootRepository(impl: BootRepositoryImpl): BootRepository
}