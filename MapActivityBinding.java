// Generated by view binder compiler. Do not edit!
package com.aau.trakio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aau.trakio.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MapActivityBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final DrawerLayout Drawer;

  @NonNull
  public final LinearLayout NavView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final ConstraintLayout mainLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final AppCompatImageView topLogo;

  private MapActivityBinding(@NonNull DrawerLayout rootView, @NonNull DrawerLayout Drawer,
      @NonNull LinearLayout NavView, @NonNull AppBarLayout appBarLayout,
      @NonNull ConstraintLayout mainLayout, @NonNull Toolbar toolbar,
      @NonNull AppCompatImageView topLogo) {
    this.rootView = rootView;
    this.Drawer = Drawer;
    this.NavView = NavView;
    this.appBarLayout = appBarLayout;
    this.mainLayout = mainLayout;
    this.toolbar = toolbar;
    this.topLogo = topLogo;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MapActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MapActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.map_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MapActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      DrawerLayout Drawer = (DrawerLayout) rootView;

      id = R.id._nav_view;
      LinearLayout NavView = ViewBindings.findChildViewById(rootView, id);
      if (NavView == null) {
        break missingId;
      }

      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.mainLayout;
      ConstraintLayout mainLayout = ViewBindings.findChildViewById(rootView, id);
      if (mainLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.top_logo;
      AppCompatImageView topLogo = ViewBindings.findChildViewById(rootView, id);
      if (topLogo == null) {
        break missingId;
      }

      return new MapActivityBinding((DrawerLayout) rootView, Drawer, NavView, appBarLayout,
          mainLayout, toolbar, topLogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
