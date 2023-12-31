// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

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
import com.aau.trakio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDriverInfoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout activityDriverInfo;

  @NonNull
  public final TextView driverInfoBusNumber;

  @NonNull
  public final TextView driverInfoCheckedInTrip;

  @NonNull
  public final Button driverInfoDeleteBtn;

  @NonNull
  public final TextView driverInfoName;

  @NonNull
  public final TextView driverInfoNumber;

  @NonNull
  public final TextView driverInfoPhone;

  private ActivityDriverInfoBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout activityDriverInfo, @NonNull TextView driverInfoBusNumber,
      @NonNull TextView driverInfoCheckedInTrip, @NonNull Button driverInfoDeleteBtn,
      @NonNull TextView driverInfoName, @NonNull TextView driverInfoNumber,
      @NonNull TextView driverInfoPhone) {
    this.rootView = rootView;
    this.activityDriverInfo = activityDriverInfo;
    this.driverInfoBusNumber = driverInfoBusNumber;
    this.driverInfoCheckedInTrip = driverInfoCheckedInTrip;
    this.driverInfoDeleteBtn = driverInfoDeleteBtn;
    this.driverInfoName = driverInfoName;
    this.driverInfoNumber = driverInfoNumber;
    this.driverInfoPhone = driverInfoPhone;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDriverInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDriverInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_driver_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDriverInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout activityDriverInfo = (LinearLayout) rootView;

      id = R.id.driver_info_bus_number;
      TextView driverInfoBusNumber = ViewBindings.findChildViewById(rootView, id);
      if (driverInfoBusNumber == null) {
        break missingId;
      }

      id = R.id.driver_info_checked_in_trip;
      TextView driverInfoCheckedInTrip = ViewBindings.findChildViewById(rootView, id);
      if (driverInfoCheckedInTrip == null) {
        break missingId;
      }

      id = R.id.driver_info_delete_btn;
      Button driverInfoDeleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (driverInfoDeleteBtn == null) {
        break missingId;
      }

      id = R.id.driver_info_name;
      TextView driverInfoName = ViewBindings.findChildViewById(rootView, id);
      if (driverInfoName == null) {
        break missingId;
      }

      id = R.id.driver_info_number;
      TextView driverInfoNumber = ViewBindings.findChildViewById(rootView, id);
      if (driverInfoNumber == null) {
        break missingId;
      }

      id = R.id.driver_info_phone;
      TextView driverInfoPhone = ViewBindings.findChildViewById(rootView, id);
      if (driverInfoPhone == null) {
        break missingId;
      }

      return new ActivityDriverInfoBinding((LinearLayout) rootView, activityDriverInfo,
          driverInfoBusNumber, driverInfoCheckedInTrip, driverInfoDeleteBtn, driverInfoName,
          driverInfoNumber, driverInfoPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
