// Generated by data binding compiler. Do not edit!
package com.example.poc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import authentication.AuthenticationViewModel;
import com.example.poc.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLoginLogin;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final TextInputEditText etLoginEmailId;

  @NonNull
  public final TextInputEditText etLoginPassword;

  @NonNull
  public final ProgressBar progressBarLogin;

  @NonNull
  public final TextInputLayout textInputLayout5;

  @NonNull
  public final TextInputLayout textInputLayout7;

  @NonNull
  public final TextView tvLoginGoToRegister;

  @NonNull
  public final TextView tvLoginResetPassword;

  @Bindable
  protected AuthenticationViewModel mViewModel;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnLoginLogin, CheckBox checkBox, TextInputEditText etLoginEmailId,
      TextInputEditText etLoginPassword, ProgressBar progressBarLogin,
      TextInputLayout textInputLayout5, TextInputLayout textInputLayout7,
      TextView tvLoginGoToRegister, TextView tvLoginResetPassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLoginLogin = btnLoginLogin;
    this.checkBox = checkBox;
    this.etLoginEmailId = etLoginEmailId;
    this.etLoginPassword = etLoginPassword;
    this.progressBarLogin = progressBarLogin;
    this.textInputLayout5 = textInputLayout5;
    this.textInputLayout7 = textInputLayout7;
    this.tvLoginGoToRegister = tvLoginGoToRegister;
    this.tvLoginResetPassword = tvLoginResetPassword;
  }

  public abstract void setViewModel(@Nullable AuthenticationViewModel viewModel);

  @Nullable
  public AuthenticationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}
