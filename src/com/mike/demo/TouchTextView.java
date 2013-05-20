package com.mike.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class TouchTextView extends TextView {
	public TouchTextView(Context context) {
		super(context);
	}

	public TouchTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TouchTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean ret = super.onTouchEvent(event);
		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			Log.d("touch", "TouchTextView onTouchEvent() ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.d("touch", "TouchTextView onTouchEvent() ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			Log.d("touch", "TouchTextView onTouchEvent() ACTION_UP");
			break;
		}
		Log.d("touch", "TouchTextView onTouchEvent() return=" + ret);
		return ret;
	}
}
