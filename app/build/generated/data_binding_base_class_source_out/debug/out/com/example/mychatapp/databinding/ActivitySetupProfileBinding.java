// Generated by view binder compiler. Do not edit!
package com.example.mychatapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mychatapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySetupProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button continueButton;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final EditText profileBox;

  private ActivitySetupProfileBinding(@NonNull LinearLayout rootView,
      @NonNull Button continueButton, @NonNull ImageView imageView, @NonNull EditText profileBox) {
    this.rootView = rootView;
    this.continueButton = continueButton;
    this.imageView = imageView;
    this.profileBox = profileBox;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySetupProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySetupProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setup_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySetupProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueButton;
      Button continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.profileBox;
      EditText profileBox = ViewBindings.findChildViewById(rootView, id);
      if (profileBox == null) {
        break missingId;
      }

      return new ActivitySetupProfileBinding((LinearLayout) rootView, continueButton, imageView,
          profileBox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
