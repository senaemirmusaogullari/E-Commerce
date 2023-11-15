package com.senaemirmusaogullari.upschoolcapstoneproject.ui.detail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentDirections {
  private DetailFragmentDirections() {
  }

  @NonNull
  public static DetailToCart detailToCart(int id) {
    return new DetailToCart(id);
  }

  public static class DetailToCart implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private DetailToCart(int id) {
      this.arguments.put("id", id);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public DetailToCart setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id")) {
        int id = (int) arguments.get("id");
        __result.putInt("id", id);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.detailToCart;
    }

    @SuppressWarnings("unchecked")
    public int getId() {
      return (int) arguments.get("id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      DetailToCart that = (DetailToCart) object;
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != that.getId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "DetailToCart(actionId=" + getActionId() + "){"
          + "id=" + getId()
          + "}";
    }
  }
}
