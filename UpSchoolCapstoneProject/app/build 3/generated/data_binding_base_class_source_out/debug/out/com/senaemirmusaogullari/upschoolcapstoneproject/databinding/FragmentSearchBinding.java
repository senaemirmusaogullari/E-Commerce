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
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView ivError;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvSearchProducts;

  @NonNull
  public final MaterialToolbar searchToolbar;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final TextView tvError;

  private FragmentSearchBinding(@NonNull CoordinatorLayout rootView, @NonNull ImageView ivError,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView rvSearchProducts,
      @NonNull MaterialToolbar searchToolbar, @NonNull SearchView searchView,
      @NonNull TextView tvError) {
    this.rootView = rootView;
    this.ivError = ivError;
    this.progressBar = progressBar;
    this.rvSearchProducts = rvSearchProducts;
    this.searchToolbar = searchToolbar;
    this.searchView = searchView;
    this.tvError = tvError;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_error;
      ImageView ivError = ViewBindings.findChildViewById(rootView, id);
      if (ivError == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rv_search_products;
      RecyclerView rvSearchProducts = ViewBindings.findChildViewById(rootView, id);
      if (rvSearchProducts == null) {
        break missingId;
      }

      id = R.id.search_toolbar;
      MaterialToolbar searchToolbar = ViewBindings.findChildViewById(rootView, id);
      if (searchToolbar == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.tv_error;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      return new FragmentSearchBinding((CoordinatorLayout) rootView, ivError, progressBar,
          rvSearchProducts, searchToolbar, searchView, tvError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
