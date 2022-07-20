// Generated by view binder compiler. Do not edit!
package com.example.poc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.poc.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomLayoutBleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button customBtnConnect;

  @NonNull
  public final TextView customTvAddress;

  @NonNull
  public final TextView customTvName;

  private CustomLayoutBleBinding(@NonNull LinearLayout rootView, @NonNull Button customBtnConnect,
      @NonNull TextView customTvAddress, @NonNull TextView customTvName) {
    this.rootView = rootView;
    this.customBtnConnect = customBtnConnect;
    this.customTvAddress = customTvAddress;
    this.customTvName = customTvName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomLayoutBleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomLayoutBleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_layout_ble, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomLayoutBleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.custom_btn_connect;
      Button customBtnConnect = ViewBindings.findChildViewById(rootView, id);
      if (customBtnConnect == null) {
        break missingId;
      }

      id = R.id.custom_tv_address;
      TextView customTvAddress = ViewBindings.findChildViewById(rootView, id);
      if (customTvAddress == null) {
        break missingId;
      }

      id = R.id.custom_tv_name;
      TextView customTvName = ViewBindings.findChildViewById(rootView, id);
      if (customTvName == null) {
        break missingId;
      }

      return new CustomLayoutBleBinding((LinearLayout) rootView, customBtnConnect, customTvAddress,
          customTvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}