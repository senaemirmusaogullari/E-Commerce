package com.senaemirmusaogullari.upschoolcapstoneproject.ui.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/home/ProductsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ProductListUI;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/home/ProductsAdapter$ProductViewHolder;", "onProductClick", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductDiffUtilCallBack", "ProductViewHolder", "app_debug"})
public final class ProductsAdapter extends androidx.recyclerview.widget.ListAdapter<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI, com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.ProductsAdapter.ProductViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onProductClick = null;
    
    public ProductsAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProductClick) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.ProductsAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.ui.home.ProductsAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/home/ProductsAdapter$ProductDiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ProductListUI;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ProductDiffUtilCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI> {
        
        public ProductDiffUtilCallBack() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI oldItem, @org.jetbrains.annotations.NotNull
        com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI oldItem, @org.jetbrains.annotations.NotNull
        com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/home/ProductsAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/databinding/ItemProductBinding;", "onProductClick", "Lkotlin/Function1;", "", "", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/databinding/ItemProductBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "product", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ProductListUI;", "app_debug"})
    public static final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.senaemirmusaogullari.upschoolcapstoneproject.databinding.ItemProductBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onProductClick = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        com.senaemirmusaogullari.upschoolcapstoneproject.databinding.ItemProductBinding binding, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProductClick) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductListUI product) {
        }
    }
}