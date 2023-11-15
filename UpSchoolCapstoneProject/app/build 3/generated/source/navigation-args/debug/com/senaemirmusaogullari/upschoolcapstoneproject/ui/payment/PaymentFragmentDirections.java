package com.senaemirmusaogullari.upschoolcapstoneproject.ui.payment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;

public class PaymentFragmentDirections {
  private PaymentFragmentDirections() {
  }

  @NonNull
  public static NavDirections paymentToSuccess() {
    return new ActionOnlyNavDirections(R.id.paymentToSuccess);
  }
}
