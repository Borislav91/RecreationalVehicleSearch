package com.borislav.recreationalvehiclesearchn.common.di

import com.borislav.recreationalvehiclesearchn.data.repository.VehicleListingRepositoryImpl
import com.borislav.recreationalvehiclesearchn.domain.repository.OutdoorsyApiService
import com.borislav.recreationalvehiclesearchn.domain.repository.VehicleListingRepository
import com.borislav.recreationalvehiclesearchn.domain.usecase.SearchRentalListingsUseCase
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://search.outdoorsy.com/rentals/") // Base URL for the Outdoorsy API
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

    @Singleton
    @Provides
    fun provideOutdoorsyApiService(retrofit: Retrofit): OutdoorsyApiService {
        return retrofit.create(OutdoorsyApiService::class.java)
    }


    @Singleton
    @Provides
    fun provideVehicleListingRepository(apiService: OutdoorsyApiService): VehicleListingRepository {
        return VehicleListingRepositoryImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideSearchRentalListingsUseCase(vehicleListingRepository: VehicleListingRepository): SearchRentalListingsUseCase {
        return SearchRentalListingsUseCase(vehicleListingRepository)
    }
}