package com.flj.latte.util.callback;

import android.support.annotation.Nullable;

/**
 * Created by 汤善强
 */

public interface IGlobalCallback<T> {

    void executeCallback(@Nullable T args);
}
