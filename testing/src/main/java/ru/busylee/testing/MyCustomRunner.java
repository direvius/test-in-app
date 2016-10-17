package ru.busylee.testing;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import android.util.Log;

/**
 * Created by busylee on 15.10.16.
 */

public class MyCustomRunner extends AndroidJUnitRunner {

  private static final String TAG = "MyCustomRunner";

  public MyCustomRunner() {}

  @Override
  public void onStart() {
    super.onStart();
    Log.d(TAG, "onStart()");
  }

  @Override
  public void finish(int resultCode, Bundle results) {
    super.finish(resultCode, results);
    Log.d(TAG, "finish()");
  }

  @Override
  public boolean onException(Object obj, Throwable e) {
    Log.d(TAG, "onException()");
    return super.onException(obj, e);
  }
}