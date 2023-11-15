package com.senaemirmusaogullari.upschoolcapstoneproject.ui.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections splashToSignin() {
    return new ActionOnlyNavDirections(R.id.splashToSignin);
  }

  @NonNull
  public static NavDirections splashToMain() {
    return new ActionOnlyNavDirections(R.id.splashToMain);
  }
}
