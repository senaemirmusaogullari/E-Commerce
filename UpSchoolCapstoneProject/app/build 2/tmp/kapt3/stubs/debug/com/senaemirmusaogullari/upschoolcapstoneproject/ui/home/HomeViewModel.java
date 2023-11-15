package com.senaemirmusaogullari.upschoolcapstoneproject.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/ProductRepository;", "authRepository", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/AuthRepository;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/ProductRepository;Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/AuthRepository;)V", "_homeState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/home/HomeState;", "homeState", "Landroidx/lifecycle/LiveData;", "getHomeState", "()Landroidx/lifecycle/LiveData;", "getProducts", "Lkotlinx/coroutines/Job;", "logOut", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeState> _homeState;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.HomeState> getHomeState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getProducts() {
        return null;
    }
    
    public final void logOut() {
    }
}