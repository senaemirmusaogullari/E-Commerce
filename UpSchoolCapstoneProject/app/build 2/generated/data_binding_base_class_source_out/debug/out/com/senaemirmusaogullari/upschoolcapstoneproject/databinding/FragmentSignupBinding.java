// Generated by view binder compiler. Do not edit!
package com.senaemirmusaogullari.upschoolcapstoneproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.senaemirmusaogullari.upschoolcapstoneproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final TextInputEditText etEmail;

  @NonNull
  public final TextInputEditText etNickname;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextInputEditText etPhone;

  @NonNull
  public final TextInputEditText etVerifyPassword;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilNickname;

  @NonNull
  public final TextInputLayout tilPassword;

  @NonNull
  public final TextInputLayout tilPhone;

  @NonNull
  public final TextInputLayout tilVerifyPassword;

  private FragmentSignupBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSignUp,
      @NonNull TextInputEditText etEmail, @NonNull TextInputEditText etNickname,
      @NonNull TextInputEditText etPassword, @NonNull TextInputEditText etPhone,
      @NonNull TextInputEditText etVerifyPassword, @NonNull ProgressBar progressBar,
      @NonNull TextView textView, @NonNull TextInputLayout tilEmail,
      @NonNull TextInputLayout tilNickname, @NonNull TextInputLayout tilPassword,
      @NonNull TextInputLayout tilPhone, @NonNull TextInputLayout tilVerifyPassword) {
    this.rootView = rootView;
    this.btnSignUp = btnSignUp;
    this.etEmail = etEmail;
    this.etNickname = etNickname;
    this.etPassword = etPassword;
    this.etPhone = etPhone;
    this.etVerifyPassword = etVerifyPassword;
    this.progressBar = progressBar;
    this.textView = textView;
    this.tilEmail = tilEmail;
    this.tilNickname = tilNickname;
    this.tilPassword = tilPassword;
    this.tilPhone = tilPhone;
    this.tilVerifyPassword = tilVerifyPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignUp;
      Button btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.et_email;
      TextInputEditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_nickname;
      TextInputEditText etNickname = ViewBindings.findChildViewById(rootView, id);
      if (etNickname == null) {
        break missingId;
      }

      id = R.id.et_password;
      TextInputEditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.et_phone;
      TextInputEditText etPhone = ViewBindings.findChildViewById(rootView, id);
      if (etPhone == null) {
        break missingId;
      }

      id = R.id.et_verify_password;
      TextInputEditText etVerifyPassword = ViewBindings.findChildViewById(rootView, id);
      if (etVerifyPassword == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_nickname;
      TextInputLayout tilNickname = ViewBindings.findChildViewById(rootView, id);
      if (tilNickname == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      id = R.id.til_phone;
      TextInputLayout tilPhone = ViewBindings.findChildViewById(rootView, id);
      if (tilPhone == null) {
        break missingId;
      }

      id = R.id.til_verify_password;
      TextInputLayout tilVerifyPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilVerifyPassword == null) {
        break missingId;
      }

      return new FragmentSignupBinding((ConstraintLayout) rootView, btnSignUp, etEmail, etNickname,
          etPassword, etPhone, etVerifyPassword, progressBar, textView, tilEmail, tilNickname,
          tilPassword, tilPhone, tilVerifyPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}