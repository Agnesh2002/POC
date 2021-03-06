// Generated by data binding compiler. Do not edit!
package com.example.poc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.poc.R;
import java.lang.Deprecated;
import java.lang.Object;
import profile.ProfileViewModel;

public abstract class FragmentProfilePictureBinding extends ViewDataBinding {
  @NonNull
  public final Button btnChooseImage;

  @NonNull
  public final Button btnUploadImage;

  @NonNull
  public final ImageView picture;

  @NonNull
  public final ProgressBar progressBarProfilePic;

  @Bindable
  protected ProfileViewModel mViewModel;

  protected FragmentProfilePictureBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button btnChooseImage, Button btnUploadImage, ImageView picture,
      ProgressBar progressBarProfilePic) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnChooseImage = btnChooseImage;
    this.btnUploadImage = btnUploadImage;
    this.picture = picture;
    this.progressBarProfilePic = progressBarProfilePic;
  }

  public abstract void setViewModel(@Nullable ProfileViewModel viewModel);

  @Nullable
  public ProfileViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_picture, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfilePictureBinding>inflateInternal(inflater, R.layout.fragment_profile_picture, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfilePictureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_picture, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfilePictureBinding>inflateInternal(inflater, R.layout.fragment_profile_picture, null, false, component);
  }

  public static FragmentProfilePictureBinding bind(@NonNull View view) {
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
  public static FragmentProfilePictureBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfilePictureBinding)bind(component, view, R.layout.fragment_profile_picture);
  }
}
