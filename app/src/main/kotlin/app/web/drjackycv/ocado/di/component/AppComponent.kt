package app.web.drjackycv.ocado.di.component

import app.web.drjackycv.ocado.application.OcadoApplication
import app.web.drjackycv.ocado.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        DataModule::class,
        ViewModelModule::class,
        ActivityModule::class,
        FragmentModule::class
    ]
)
interface AppComponent : AndroidInjector<OcadoApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: OcadoApplication): Builder

        fun build(): AppComponent

    }

}