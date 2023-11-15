package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signIn;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;

public class SignInFragmentDirections {
  private SignInFragmentDirections() {
  }

  @NonNull
  public static NavDirections signinToSignUp() {
    return new ActionOnlyNavDirections(R.id.signinToSignUp);
  }

  @NonNull
  public static NavDirections signinToForgot() {
    return new ActionOnlyNavDirections(R.id.signinToForgot);
  }

  @NonNull
  public static NavDirections signinToMain() {
    return new ActionOnlyNavDirections(R.id.signinToMain);
  }
}
