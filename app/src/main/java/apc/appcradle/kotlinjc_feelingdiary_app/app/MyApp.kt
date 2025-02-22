package apc.appcradle.kotlinjc_feelingdiary_app.app

import android.app.Application
import apc.appcradle.kotlinjc_feelingdiary_app.app.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
            modules(appModule)
        }
    }
}