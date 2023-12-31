package com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/ProductRepository;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/ProductRepository;)V", "_detailState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/detail/DetailState;", "detailState", "Landroidx/lifecycle/LiveData;", "getDetailState", "()Landroidx/lifecycle/LiveData;", "getProductDetail", "Lkotlinx/coroutines/Job;", "id", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailState> _detailState;
    
    @javax.inject.Inject
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail.DetailState> getDetailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getProductDetail(int id) {
        return null;
    }
}