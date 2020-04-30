package app.web.drjackycv.ocado.di.module

import app.web.drjackycv.ocado.di.scope.PerView
import app.web.drjackycv.presentation.products.productdetail.ProductDetailFragment
import app.web.drjackycv.presentation.products.productlist.ProductsListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @PerView
    @ContributesAndroidInjector
    abstract fun productsList(): ProductsListFragment

    @PerView
    @ContributesAndroidInjector
    abstract fun productDetail(): ProductDetailFragment

}