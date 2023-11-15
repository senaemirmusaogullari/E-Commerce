package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState;", "", "GoToHome", "Loading", "ShowPopUp", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState$GoToHome;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState$Loading;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState$ShowPopUp;", "app_debug"})
public abstract interface SignUpState {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState$GoToHome;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState;", "()V", "app_debug"})
    public static final class GoToHome implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState {
        @org.jetbrains.annotations.NotNull
        public static final com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState.GoToHome INSTANCE = null;
        
        private GoToHome() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState$Loading;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState;", "()V", "app_debug"})
    public static final class Loading implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState {
        @org.jetbrains.annotations.NotNull
        public static final com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState$ShowPopUp;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ShowPopUp implements com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState {
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
        public final com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState.ShowPopUp copy(@org.jetbrains.annotations.NotNull
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
}