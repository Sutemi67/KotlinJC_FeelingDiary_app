package apc.appcradle.kotlinjc_feelingdiary_app.app.di

import androidx.room.Room
import apc.appcradle.kotlinjc_feelingdiary_app.data.Repository
import apc.appcradle.kotlinjc_feelingdiary_app.data.database.AppDatabase
import apc.appcradle.kotlinjc_feelingdiary_app.data.database.Converter
import apc.appcradle.kotlinjc_feelingdiary_app.domain.RepositoryInterface
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { MainViewModel(get()) }
    single<RepositoryInterface> { Repository(get(), get()) }
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "database.db")
            .fallbackToDestructiveMigration()
            .build()
    }
    single { Converter() }
}