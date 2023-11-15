package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/AuthRepository;", "(Lcom/senaemirmusaogullari/upschoolcapstoneproject/data/repository/AuthRepository;)V", "_signUpState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/senaemirmusaogullari/upschoolcapstoneproject/ui/login/signUp/SignUpState;", "signUpState", "Landroidx/lifecycle/LiveData;", "getSignUpState", "()Landroidx/lifecycle/LiveData;", "checkFields", "", "nickname", "", "email", "phone", "password", "verifyPassword", "signUp", "Lkotlinx/coroutines/Job;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState> _signUpState;
    
    @javax.inject.Inject
    public SignUpViewModel(@org.jetbrains.annotations.NotNull
    com.senaemirmusaogullari.upschoolcapstoneproject.data.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp.SignUpState> getSignUpState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job signUp(@org.jetbrains.annotations.NotNull
    java.lang.String nickname, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String verifyPassword) {
        return null;
    }
    
    private final boolean checkFields(java.lang.String nickname, java.lang.String email, java.lang.String phone, java.lang.String password, java.lang.String verifyPassword) {
        return false;
    }
}