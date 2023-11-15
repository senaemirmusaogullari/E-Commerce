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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivEmpty;

  @NonNull
  public final ImageView ivProduct;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvEmpty;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvTitle;

  private FragmentDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivEmpty,
      @NonNull ImageView ivProduct, @NonNull ProgressBar progressBar,
      @NonNull TextView tvDescription, @NonNull TextView tvEmpty, @NonNull TextView tvPrice,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ivEmpty = ivEmpty;
    this.ivProduct = ivProduct;
    this.progressBar = progressBar;
    this.tvDescription = tvDescription;
    this.tvEmpty = tvEmpty;
    this.tvPrice = tvPrice;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_empty;
      ImageView ivEmpty = ViewBindings.findChildViewById(rootView, id);
      if (ivEmpty == null) {
        break missingId;
      }

      id = R.id.iv_product;
      ImageView ivProduct = ViewBindings.findChildViewById(rootView, id);
      if (ivProduct == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.tv_description;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tv_empty;
      TextView tvEmpty = ViewBindings.findChildViewById(rootView, id);
      if (tvEmpty == null) {
        break missingId;
      }

      id = R.id.tv_price;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentDetailBinding((ConstraintLayout) rootView, ivEmpty, ivProduct, progressBar,
          tvDescription, tvEmpty, tvPrice, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}