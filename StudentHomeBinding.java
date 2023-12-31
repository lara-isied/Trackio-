// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aau.trakio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StudentHomeBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final CardView studentHomeCvMap;

  @NonNull
  public final LinearLayout studentHomeLl;

  @NonNull
  public final Toolbar studentHomeToolbar;

  private StudentHomeBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout coordinatorLayout, @NonNull CardView studentHomeCvMap,
      @NonNull LinearLayout studentHomeLl, @NonNull Toolbar studentHomeToolbar) {
    this.rootView = rootView;
    this.coordinatorLayout = coordinatorLayout;
    this.studentHomeCvMap = studentHomeCvMap;
    this.studentHomeLl = studentHomeLl;
    this.studentHomeToolbar = studentHomeToolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StudentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StudentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.student_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StudentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout coordinatorLayout = (CoordinatorLayout) rootView;

      id = R.id.student_home_cv_map;
      CardView studentHomeCvMap = ViewBindings.findChildViewById(rootView, id);
      if (studentHomeCvMap == null) {
        break missingId;
      }

      id = R.id.student_home_ll;
      LinearLayout studentHomeLl = ViewBindings.findChildViewById(rootView, id);
      if (studentHomeLl == null) {
        break missingId;
      }

      id = R.id.student_home_toolbar;
      Toolbar studentHomeToolbar = ViewBindings.findChildViewById(rootView, id);
      if (studentHomeToolbar == null) {
        break missingId;
      }

      return new StudentHomeBinding((CoordinatorLayout) rootView, coordinatorLayout,
          studentHomeCvMap, studentHomeLl, studentHomeToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
