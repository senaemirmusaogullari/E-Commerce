// Generated by Dagger (https://dagger.dev).
package com.senaemirmusaogullari.upschoolcapstoneproject;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.google.firebase.auth.FirebaseAuth;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductRoomDB;
import com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.FirebaseModule;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.FirebaseModule_ProvideFirebaseAuthFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.NetworkModule;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.NetworkModule_ProvideChuckerInterceptorFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.NetworkModule_ProvideOkHttpFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.NetworkModule_ProvideProductServiceFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.NetworkModule_ProvideRetrofitFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.RepositoryModule;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.RepositoryModule_ProvideAuthRepositoryFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.RepositoryModule_ProvideProductsRepositoryFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.RoomDBModule;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.RoomDBModule_ProvideProductDaoFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.di.RoomDBModule_ProvideProductRoomDBFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.MainActivity;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartViewModel_HiltModules_KeyModule_ProvideFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailFragment;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeFragment;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword.ForgotViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword.ForgotViewModel_HiltModules_KeyModule_ProvideFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signIn.SignInFragment;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signIn.SignInViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signIn.SignInViewModel_HiltModules_KeyModule_ProvideFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpFragment;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.splash.SplashViewModel;
import com.senaemirmusaogullari.upschoolcapstoneproject.ui.splash.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerMainApplication_HiltComponents_SingletonC {
  private DaggerMainApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder firebaseModule(FirebaseModule firebaseModule) {
      Preconditions.checkNotNull(firebaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder roomDBModule(RoomDBModule roomDBModule) {
      Preconditions.checkNotNull(roomDBModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectDetailFragment(DetailFragment detailFragment) {
    }

    @Override
    public void injectHomeFragment(HomeFragment homeFragment) {
    }

    @Override
    public void injectSignInFragment(SignInFragment signInFragment) {
    }

    @Override
    public void injectSignUpFragment(SignUpFragment signUpFragment) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(7).add(CartViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DetailViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ForgotViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SignInViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SignUpViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<CartViewModel> cartViewModelProvider;

    private Provider<DetailViewModel> detailViewModelProvider;

    private Provider<ForgotViewModel> forgotViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<SignInViewModel> signInViewModelProvider;

    private Provider<SignUpViewModel> signUpViewModelProvider;

    private Provider<SplashViewModel> splashViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.cartViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.detailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.forgotViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.signInViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.signUpViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(7).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartViewModel", ((Provider) cartViewModelProvider)).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailViewModel", ((Provider) detailViewModelProvider)).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword.ForgotViewModel", ((Provider) forgotViewModelProvider)).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signIn.SignInViewModel", ((Provider) signInViewModelProvider)).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpViewModel", ((Provider) signUpViewModelProvider)).put("com.senaemirmusaogullari.upschoolcapstoneproject.ui.splash.SplashViewModel", ((Provider) splashViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartViewModel 
          return (T) new CartViewModel(singletonCImpl.provideProductsRepositoryProvider.get(), singletonCImpl.provideAuthRepositoryProvider.get());

          case 1: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailViewModel 
          return (T) new DetailViewModel(singletonCImpl.provideProductsRepositoryProvider.get());

          case 2: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.forgotpassword.ForgotViewModel 
          return (T) new ForgotViewModel(singletonCImpl.provideProductsRepositoryProvider.get());

          case 3: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.provideProductsRepositoryProvider.get(), singletonCImpl.provideAuthRepositoryProvider.get());

          case 4: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signIn.SignInViewModel 
          return (T) new SignInViewModel(singletonCImpl.provideAuthRepositoryProvider.get());

          case 5: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpViewModel 
          return (T) new SignUpViewModel(singletonCImpl.provideAuthRepositoryProvider.get());

          case 6: // com.senaemirmusaogullari.upschoolcapstoneproject.ui.splash.SplashViewModel 
          return (T) new SplashViewModel(singletonCImpl.provideAuthRepositoryProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends MainApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<ChuckerInterceptor> provideChuckerInterceptorProvider;

    private Provider<OkHttpClient> provideOkHttpProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<ProductService> provideProductServiceProvider;

    private Provider<ProductRoomDB> provideProductRoomDBProvider;

    private Provider<ProductDao> provideProductDaoProvider;

    private Provider<ProductRepository> provideProductsRepositoryProvider;

    private Provider<FirebaseAuth> provideFirebaseAuthProvider;

    private Provider<AuthRepository> provideAuthRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideChuckerInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<ChuckerInterceptor>(singletonCImpl, 4));
      this.provideOkHttpProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 3));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 2));
      this.provideProductServiceProvider = DoubleCheck.provider(new SwitchingProvider<ProductService>(singletonCImpl, 1));
      this.provideProductRoomDBProvider = DoubleCheck.provider(new SwitchingProvider<ProductRoomDB>(singletonCImpl, 6));
      this.provideProductDaoProvider = DoubleCheck.provider(new SwitchingProvider<ProductDao>(singletonCImpl, 5));
      this.provideProductsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ProductRepository>(singletonCImpl, 0));
      this.provideFirebaseAuthProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseAuth>(singletonCImpl, 8));
      this.provideAuthRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<AuthRepository>(singletonCImpl, 7));
    }

    @Override
    public void injectMainApplication(MainApplication mainApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository 
          return (T) RepositoryModule_ProvideProductsRepositoryFactory.provideProductsRepository(singletonCImpl.provideProductServiceProvider.get(), singletonCImpl.provideProductDaoProvider.get());

          case 1: // com.senaemirmusaogullari.upschoolcapstoneproject.data.source.remote.ProductService 
          return (T) NetworkModule_ProvideProductServiceFactory.provideProductService(singletonCImpl.provideRetrofitProvider.get());

          case 2: // retrofit2.Retrofit 
          return (T) NetworkModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideOkHttpProvider.get());

          case 3: // okhttp3.OkHttpClient 
          return (T) NetworkModule_ProvideOkHttpFactory.provideOkHttp(singletonCImpl.provideChuckerInterceptorProvider.get());

          case 4: // com.chuckerteam.chucker.api.ChuckerInterceptor 
          return (T) NetworkModule_ProvideChuckerInterceptorFactory.provideChuckerInterceptor(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 5: // com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductDao 
          return (T) RoomDBModule_ProvideProductDaoFactory.provideProductDao(singletonCImpl.provideProductRoomDBProvider.get());

          case 6: // com.senaemirmusaogullari.upschoolcapstoneproject.data.source.local.ProductRoomDB 
          return (T) RoomDBModule_ProvideProductRoomDBFactory.provideProductRoomDB(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 7: // com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository 
          return (T) RepositoryModule_ProvideAuthRepositoryFactory.provideAuthRepository(singletonCImpl.provideFirebaseAuthProvider.get());

          case 8: // com.google.firebase.auth.FirebaseAuth 
          return (T) FirebaseModule_ProvideFirebaseAuthFactory.provideFirebaseAuth();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
