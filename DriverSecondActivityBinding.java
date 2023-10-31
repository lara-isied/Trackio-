// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aau.trakio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DriverSecondActivityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView txtBundle;

  private DriverSecondActivityBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView txtBundle) {
    this.rootView = rootView;
    this.txtBundle = txtBundle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DriverSecondActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DriverSecondActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.driver_second_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DriverSecondActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txt_bundle;
      TextView txtBundle = ViewBindings.findChildViewById(rootView, id);
      if (txtBundle == null) {
        break missingId;
      }

      return new DriverSecondActivityBinding((RelativeLayout) rootView, txtBundle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}