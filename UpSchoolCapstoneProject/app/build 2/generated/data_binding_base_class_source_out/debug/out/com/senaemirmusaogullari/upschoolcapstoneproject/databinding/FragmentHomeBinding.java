// Generated by view binder compiler. Do not edit!
package com.senaemirmusaogullari.upschoolcapstoneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivEmpty;

  @NonNull
  public final ImageView ivLogout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvProducts;

  @NonNull
  public final TextView tvEmpty;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivEmpty,
      @NonNull ImageView ivLogout, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rvProducts, @NonNull TextView tvEmpty) {
    this.rootView = rootView;
    this.ivEmpty = ivEmpty;
    this.ivLogout = ivLogout;
    this.progressBar = progressBar;
    this.rvProducts = rvProducts;
    this.tvEmpty = tvEmpty;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_empty;
      ImageView ivEmpty = ViewBindings.findChildViewById(rootView, id);
      if (ivEmpty == null) {
        break missingId;
      }

      id = R.id.iv_logout;
      ImageView ivLogout = ViewBindings.findChildViewById(rootView, id);
      if (ivLogout == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rv_products;
      RecyclerView rvProducts = ViewBindings.findChildViewById(rootView, id);
      if (rvProducts == null) {
        break missingId;
      }

      id = R.id.tv_empty;
      TextView tvEmpty = ViewBindings.findChildViewById(rootView, id);
      if (tvEmpty == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, ivEmpty, ivLogout, progressBar,
          rvProducts, tvEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
