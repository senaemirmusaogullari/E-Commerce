package com.senaemirmusaogullari.upschoolcapstoneproject.ui.login.signUp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;

public class SignUpFragmentDirections {
  private SignUpFragmentDirections() {
  }

  @NonNull
  public static NavDirections signupToMain() {
    return new ActionOnlyNavDirections(R.id.signupToMain);
  }
}
