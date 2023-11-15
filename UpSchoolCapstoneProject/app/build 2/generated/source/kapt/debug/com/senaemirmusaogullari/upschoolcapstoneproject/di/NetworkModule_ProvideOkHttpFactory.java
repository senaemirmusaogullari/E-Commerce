// Generated by Dagger (https://dagger.dev).
package com.senaemirmusaogullari.upschoolcapstoneproject.di;

import com.chuckerteam.chucker.api.ChuckerInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvideOkHttpFactory implements Factory<OkHttpClient> {
  private final Provider<ChuckerInterceptor> chuckerProvider;

  public NetworkModule_ProvideOkHttpFactory(Provider<ChuckerInterceptor> chuckerProvider) {
    this.chuckerProvider = chuckerProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttp(chuckerProvider.get());
  }

  public static NetworkModule_ProvideOkHttpFactory create(
      Provider<ChuckerInterceptor> chuckerProvider) {
    return new NetworkModule_ProvideOkHttpFactory(chuckerProvider);
  }

  public static OkHttpClient provideOkHttp(ChuckerInterceptor chucker) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttp(chucker));
  }
}
