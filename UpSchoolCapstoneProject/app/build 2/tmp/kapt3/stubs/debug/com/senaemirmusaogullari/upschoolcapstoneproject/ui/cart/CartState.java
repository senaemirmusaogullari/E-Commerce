package com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState;", "", "EmptyScreen", "Loading", "ShowPopUp", "SuccessState", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$EmptyScreen;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$Loading;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$ShowPopUp;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$SuccessState;", "app_debug"})
public abstract interface CartState {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$EmptyScreen;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState;", "failMessage", "", "(Ljava/lang/String;)V", "getFailMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class EmptyScreen implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String failMessage = null;
        
        public EmptyScreen(@org.jetbrains.annotations.NotNull
        java.lang.String failMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFailMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState.EmptyScreen copy(@org.jetbrains.annotations.NotNull
        java.lang.String failMessage) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$Loading;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState;", "()V", "app_debug"})
    public static final class Loading implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState {
        @org.jetbrains.annotations.NotNull
        public static final com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$ShowPopUp;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ShowPopUp implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String errorMessage = null;
        
        public ShowPopUp(@org.jetbrains.annotations.NotNull
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState.ShowPopUp copy(@org.jetbrains.annotations.NotNull
        java.lang.String errorMessage) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState$SuccessState;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/cart/CartState;", "products", "", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/model/response/ProductUI;", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SuccessState implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI> products = null;
        
        public SuccessState(@org.jetbrains.annotations.NotNull
        java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI> products) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI> getProducts() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.senaemirmusaogullari.upschoolcapstoneproject.ui.cart.CartState.SuccessState copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.senaemirmusaogullari.upschoolcapstoneproject.data.model.response.ProductUI> products) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}