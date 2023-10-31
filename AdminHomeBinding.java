// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aau.trakio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdminHomeBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CardView adminHomeCvMap;

  @NonNull
  public final LinearLayout adminHomeLl;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  private AdminHomeBinding(@NonNull CoordinatorLayout rootView, @NonNull CardView adminHomeCvMap,
      @NonNull LinearLayout adminHomeLl, @NonNull CoordinatorLayout coordinatorLayout) {
    this.rootView = rootView;
    this.adminHomeCvMap = adminHomeCvMap;
    this.adminHomeLl = adminHomeLl;
    this.coordinatorLayout = coordinatorLayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdminHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdminHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.admin_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdminHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admin_home_cv_map;
      CardView adminHomeCvMap = ViewBindings.findChildViewById(rootView, id);
      if (adminHomeCvMap == null) {
        break missingId;
      }

      id = R.id.admin_home_ll;
      LinearLayout adminHomeLl = ViewBindings.findChildViewById(rootView, id);
      if (adminHomeLl == null) {
        break missingId;
      }

      CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;

      return new AdminHomeBinding((CoordinatorLayout) rootView, adminHomeCvMap, adminHomeLl,
          coordinatorLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
