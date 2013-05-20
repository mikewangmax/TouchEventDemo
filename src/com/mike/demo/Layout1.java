package com.mike.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class Layout1 extends LinearLayout {

	public static final String LOGTAG = "Layout1";

	public Layout1(Context context) {
		super(context);
	}

	public Layout1(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public Layout1(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean ret = super.onTouchEvent(event);
		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			Log.d("touch", "Layout1 onTouchEvent() ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.d("touch", "Layout1 onTouchEvent() ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			Log.d("touch", "Layout1 onTouchEvent() ACTION_UP");
			break;
		}
		Log.d("touch", "Layout1 onTouchEvent() return=" + ret);
		return ret;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		boolean ret = super.onInterceptTouchEvent(ev);
		int action = ev.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			Log.d("touch", "Layout1 onInterceptTouchEvent() ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.d("touch", "Layout1 onInterceptTouchEvent() ACTION_MOVE");
			ret = true;
			break;
		case MotionEvent.ACTION_UP:
			Log.d("touch", "Layout1 onInterceptTouchEvent() ACTION_UP");
			break;
		}
		Log.d("touch", "Layout1 onInterceptTouchEvent() return=" + ret);
		return ret;
	}
}
