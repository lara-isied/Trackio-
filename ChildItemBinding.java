// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ChildItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView stopPoint;

  @NonNull
  public final TextView stopTime;

  private ChildItemBinding(@NonNull LinearLayout rootView, @NonNull TextView stopPoint,
      @NonNull TextView stopTime) {
    this.rootView = rootView;
    this.stopPoint = stopPoint;
    this.stopTime = stopTime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChildItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChildItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.child_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChildItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.stop_point;
      TextView stopPoint = ViewBindings.findChildViewById(rootView, id);
      if (stopPoint == null) {
        break missingId;
      }

      id = R.id.stop_time;
      TextView stopTime = ViewBindings.findChildViewById(rootView, id);
      if (stopTime == null) {
        break missingId;
      }

      return new ChildItemBinding((LinearLayout) rootView, stopPoint, stopTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
