package com.tyk.pulltorefresh.pullableview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.tyk.pulltorefresh.ScrollViewListener;


public class PullableScrollView extends ScrollView implements Pullable
{

    private ScrollViewListener scrollViewListener = null;

    public PullableScrollView(Context context)
	{
		super(context);
	}

	public PullableScrollView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}

	public PullableScrollView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
	}

//	@Override
//	public boolean canPullDown()
//	{
//		if (getScrollY() == 0)
//			return true;
//		else
//			return false;
//	}

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }

    	@Override
	public boolean canPullDown()
	{
			return false;
	}

	@Override
	public boolean canPullUp()
	{
		if (getScrollY() >= (getChildAt(0).getHeight() - getMeasuredHeight()))
			return true;
		else
			return false;
	}

}
