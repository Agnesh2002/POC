// Generated by data binding compiler. Do not edit!
package com.example.poc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.poc.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import livestream.LiveStreamViewModel;

public abstract class FragmentLiveStreamBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLoadUrl;

  @NonNull
  public final TextInputEditText etIp;

  @NonNull
  public final TextInputEditText etPath;

  @NonNull
  public final TextInputEditText etPort;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @Bindable
  protected LiveStreamViewModel mViewModel;

  protected FragmentLiveStreamBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnLoadUrl, TextInputEditText etIp, TextInputEditText etPath, TextInputEditText etPort,
      TextInputLayout textInputLayout2, TextInputLayout textInputLayout3,
      TextInputLayout textInputLayout4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLoadUrl = btnLoadUrl;
    this.etIp = etIp;
    this.etPath = etPath;
    this.etPort = etPort;
    this.textInputLayout2 = textInputLayout2;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
  }

  public abstract void setViewModel(@Nullable LiveStreamViewModel viewModel);

  @Nullable
  public LiveStreamViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentLiveStreamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_live_stream, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLiveStreamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLiveStreamBinding>inflateInternal(inflater, R.layout.fragment_live_stream, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLiveStreamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_live_stream, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLiveStreamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLiveStreamBinding>inflateInternal(inflater, R.layout.fragment_live_stream, null, false, component);
  }

  public static FragmentLiveStreamBinding bind(@NonNull View view) {
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
  public static FragmentLiveStreamBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLiveStreamBinding)bind(component, view, R.layout.fragment_live_stream);
  }
}