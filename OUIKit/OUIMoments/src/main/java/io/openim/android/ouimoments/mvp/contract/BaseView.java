package io.openim.android.ouimoments.mvp.contract;

/**
 */
public interface BaseView {
    void showLoading(String msg);
    void hideLoading();
    void showError(String errorMsg);


}