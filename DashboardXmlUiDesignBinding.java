// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aau.trakio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DashboardXmlUiDesignBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ProgressBar progressBar1;

  @NonNull
  public final ProgressBar progressBar3;

  @NonNull
  public final ProgressBar progressBar4;

  @NonNull
  public final TextView progressCircleText;

  @NonNull
  public final TextView progressCircleText1;

  @NonNull
  public final TextView progressCircleText3;

  @NonNull
  public final TextView progressCircleText4;

  private DashboardXmlUiDesignBinding(@NonNull ScrollView rootView,
      @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar1,
      @NonNull ProgressBar progressBar3, @NonNull ProgressBar progressBar4,
      @NonNull TextView progressCircleText, @NonNull TextView progressCircleText1,
      @NonNull TextView progressCircleText3, @NonNull TextView progressCircleText4) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.progressBar1 = progressBar1;
    this.progressBar3 = progressBar3;
    this.progressBar4 = progressBar4;
    this.progressCircleText = progressCircleText;
    this.progressCircleText1 = progressCircleText1;
    this.progressCircleText3 = progressCircleText3;
    this.progressCircleText4 = progressCircleText4;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DashboardXmlUiDesignBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DashboardXmlUiDesignBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dashboard_xml_ui_design, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DashboardXmlUiDesignBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progressBar1;
      ProgressBar progressBar1 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar1 == null) {
        break missingId;
      }

      id = R.id.progressBar3;
      ProgressBar progressBar3 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar3 == null) {
        break missingId;
      }

      id = R.id.progressBar4;
      ProgressBar progressBar4 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar4 == null) {
        break missingId;
      }

      id = R.id.progress_circle_text;
      TextView progressCircleText = ViewBindings.findChildViewById(rootView, id);
      if (progressCircleText == null) {
        break missingId;
      }

      id = R.id.progress_circle_text1;
      TextView progressCircleText1 = ViewBindings.findChildViewById(rootView, id);
      if (progressCircleText1 == null) {
        break missingId;
      }

      id = R.id.progress_circle_text3;
      TextView progressCircleText3 = ViewBindings.findChildViewById(rootView, id);
      if (progressCircleText3 == null) {
        break missingId;
      }

      id = R.id.progress_circle_text4;
      TextView progressCircleText4 = ViewBindings.findChildViewById(rootView, id);
      if (progressCircleText4 == null) {
        break missingId;
      }

      return new DashboardXmlUiDesignBinding((ScrollView) rootView, progressBar, progressBar1,
          progressBar3, progressBar4, progressCircleText, progressCircleText1, progressCircleText3,
          progressCircleText4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}