package com.senaemirmusaogullari.upschoolcapstoneproject.ui.payment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;

public class SuccessFragmentDirections {
  private SuccessFragmentDirections() {
  }

  @NonNull
  public static NavDirections successToHome() {
    return new ActionOnlyNavDirections(R.id.successToHome);
  }
}
