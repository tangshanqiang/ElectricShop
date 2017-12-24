package com.flj.latte.ec.pay;

/**
 * Created by 汤善强
 */

public interface IAlPayResultListener {

    void onPaySuccess();

    void onPaying();

    void onPayFail();

    void onPayCancel();

    void onPayConnectError();
}
