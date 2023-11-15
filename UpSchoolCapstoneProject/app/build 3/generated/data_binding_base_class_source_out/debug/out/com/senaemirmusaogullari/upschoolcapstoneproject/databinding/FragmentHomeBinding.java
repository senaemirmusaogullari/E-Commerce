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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
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
  public final ImageView ivError;

  @NonNull
  public final ImageView ivLogout;

  @NonNull
  public final NestedScrollView nestedScrollView3;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvProducts;

  @NonNull
  public final RecyclerView rvSaleProducts;

  @NonNull
  public final Toolbar toolbar2;

  @NonNull
  public final TextView tvError;

  @NonNull
  public final TextView tvProducts;

  @NonNull
  public final TextView tvSale;

  @NonNull
  public final TextView tvToolbarTitle2;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivError,
      @NonNull ImageView ivLogout, @NonNull NestedScrollView nestedScrollView3,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView rvProducts,
      @NonNull RecyclerView rvSaleProducts, @NonNull Toolbar toolbar2, @NonNull TextView tvError,
      @NonNull TextView tvProducts, @NonNull TextView tvSale, @NonNull TextView tvToolbarTitle2) {
    this.rootView = rootView;
    this.ivError = ivError;
    this.ivLogout = ivLogout;
    this.nestedScrollView3 = nestedScrollView3;
    this.progressBar = progressBar;
    this.rvProducts = rvProducts;
    this.rvSaleProducts = rvSaleProducts;
    this.toolbar2 = toolbar2;
    this.tvError = tvError;
    this.tvProducts = tvProducts;
    this.tvSale = tvSale;
    this.tvToolbarTitle2 = tvToolbarTitle2;
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
      id = R.id.iv_error;
      ImageView ivError = ViewBindings.findChildViewById(rootView, id);
      if (ivError == null) {
        break missingId;
      }

      id = R.id.ivLogout;
      ImageView ivLogout = ViewBindings.findChildViewById(rootView, id);
      if (ivLogout == null) {
        break missingId;
      }

      id = R.id.nestedScrollView3;
      NestedScrollView nestedScrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView3 == null) {
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

      id = R.id.rvSaleProducts;
      RecyclerView rvSaleProducts = ViewBindings.findChildViewById(rootView, id);
      if (rvSaleProducts == null) {
        break missingId;
      }

      id = R.id.toolbar2;
      Toolbar toolbar2 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar2 == null) {
        break missingId;
      }

      id = R.id.tv_error;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      id = R.id.tvProducts;
      TextView tvProducts = ViewBindings.findChildViewById(rootView, id);
      if (tvProducts == null) {
        break missingId;
      }

      id = R.id.tvSale;
      TextView tvSale = ViewBindings.findChildViewById(rootView, id);
      if (tvSale == null) {
        break missingId;
      }

      id = R.id.tv_toolbar_title2;
      TextView tvToolbarTitle2 = ViewBindings.findChildViewById(rootView, id);
      if (tvToolbarTitle2 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, ivError, ivLogout,
          nestedScrollView3, progressBar, rvProducts, rvSaleProducts, toolbar2, tvError, tvProducts,
          tvSale, tvToolbarTitle2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
