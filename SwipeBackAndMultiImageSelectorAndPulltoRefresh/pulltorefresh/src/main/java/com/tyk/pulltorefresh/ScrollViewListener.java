package com.tyk.pulltorefresh;

import com.tyk.pulltorefresh.pullableview.PullableScrollView;

/**
 * Created by Administrator on 2016/12/19 0019.
 * user:tyk
 */
public interface ScrollViewListener {

    void onScrollChanged(PullableScrollView scrollView, int x, int y, int oldx, int oldy);

}
