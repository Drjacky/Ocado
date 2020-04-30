package app.web.drjackycv.ocado.di.module

import app.web.drjackycv.ocado.di.scope.PerView
import app.web.drjackycv.presentation.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @PerView
    @ContributesAndroidInjector
    abstract fun main(): MainActivity

}