// Generated by data binding compiler. Do not edit!
package com.example.poc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.poc.R;
import java.lang.Deprecated;
import java.lang.Object;
import weather.WeatherViewModel;

public abstract class FragmentWeatherBinding extends ViewDataBinding {
  @NonNull
  public final Button btnWeatherGo;

  @NonNull
  public final CardView cardWeather;

  @NonNull
  public final RecyclerView forecastRecyclerView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ProgressBar progressBarWeather;

  @NonNull
  public final AutoCompleteTextView searchView;

  @NonNull
  public final ImageView temperatureImg;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView tvFeelsLike;

  @NonNull
  public final TextView tvHumidity;

  @NonNull
  public final TextView tvMaxTemp;

  @NonNull
  public final TextView tvMinTemp;

  @NonNull
  public final TextView tvTemp;

  @NonNull
  public final TextView tvWeatherCondition;

  @NonNull
  public final TextView tvWeatherDescription;

  @NonNull
  public final TextView tvWindSpeed;

  @NonNull
  public final ImageView weatherConditionImage;

  @Bindable
  protected WeatherViewModel mViewModel;

  protected FragmentWeatherBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnWeatherGo, CardView cardWeather, RecyclerView forecastRecyclerView,
      ImageView imageView2, ImageView imageView3, ProgressBar progressBarWeather,
      AutoCompleteTextView searchView, ImageView temperatureImg, TextView textView6,
      TextView tvFeelsLike, TextView tvHumidity, TextView tvMaxTemp, TextView tvMinTemp,
      TextView tvTemp, TextView tvWeatherCondition, TextView tvWeatherDescription,
      TextView tvWindSpeed, ImageView weatherConditionImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnWeatherGo = btnWeatherGo;
    this.cardWeather = cardWeather;
    this.forecastRecyclerView = forecastRecyclerView;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.progressBarWeather = progressBarWeather;
    this.searchView = searchView;
    this.temperatureImg = temperatureImg;
    this.textView6 = textView6;
    this.tvFeelsLike = tvFeelsLike;
    this.tvHumidity = tvHumidity;
    this.tvMaxTemp = tvMaxTemp;
    this.tvMinTemp = tvMinTemp;
    this.tvTemp = tvTemp;
    this.tvWeatherCondition = tvWeatherCondition;
    this.tvWeatherDescription = tvWeatherDescription;
    this.tvWindSpeed = tvWindSpeed;
    this.weatherConditionImage = weatherConditionImage;
  }

  public abstract void setViewModel(@Nullable WeatherViewModel viewModel);

  @Nullable
  public WeatherViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_weather, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWeatherBinding>inflateInternal(inflater, R.layout.fragment_weather, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_weather, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWeatherBinding>inflateInternal(inflater, R.layout.fragment_weather, null, false, component);
  }

  public static FragmentWeatherBinding bind(@NonNull View view) {
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
  public static FragmentWeatherBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWeatherBinding)bind(component, view, R.layout.fragment_weather);
  }
}
