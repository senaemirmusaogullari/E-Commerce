// Generated by Dagger (https://dagger.dev).
package com.senaemirmusaogullari.upschoolcapstoneproject.di;

import android.content.Context;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductRoomDB;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RoomDBModule_ProvideProductRoomDBFactory implements Factory<ProductRoomDB> {
  private final Provider<Context> contextProvider;

  public RoomDBModule_ProvideProductRoomDBFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ProductRoomDB get() {
    return provideProductRoomDB(contextProvider.get());
  }

  public static RoomDBModule_ProvideProductRoomDBFactory create(Provider<Context> contextProvider) {
    return new RoomDBModule_ProvideProductRoomDBFactory(contextProvider);
  }

  public static ProductRoomDB provideProductRoomDB(Context context) {
    return Preconditions.checkNotNullFromProvides(RoomDBModule.INSTANCE.provideProductRoomDB(context));
  }
}
