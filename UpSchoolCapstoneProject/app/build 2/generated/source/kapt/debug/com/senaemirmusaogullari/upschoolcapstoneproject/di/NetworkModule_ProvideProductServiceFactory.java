// Generated by Dagger (https://dagger.dev).
package com.senaemirmusaogullari.upschoolcapstoneproject.di;

import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvideProductServiceFactory implements Factory<ProductService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideProductServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ProductService get() {
    return provideProductService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideProductServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideProductServiceFactory(retrofitProvider);
  }

  public static ProductService provideProductService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideProductService(retrofit));
  }
}