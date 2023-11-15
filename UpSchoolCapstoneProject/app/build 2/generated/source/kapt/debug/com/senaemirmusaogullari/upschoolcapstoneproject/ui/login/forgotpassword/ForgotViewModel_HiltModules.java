package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = ForgotViewModel.class
)
public final class ForgotViewModel_HiltModules {
  private ForgotViewModel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword.ForgotViewModel")
    @HiltViewModelMap
    public abstract ViewModel binds(ForgotViewModel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword.ForgotViewModel";
    }
  }
}