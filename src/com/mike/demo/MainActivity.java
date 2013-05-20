package com.mike.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener {

	public static final String LOGTAG = "toggle_language";
	private LinearLayout mLayout1;
	private LinearLayout mLayout2;
	private TextView mTextview;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(LOGTAG, "onCreate()");
		setContentView(R.layout.activity_main);
		mLayout1 = (LinearLayout) findViewById(R.id.layout1);
		mLayout2 = (LinearLayout) findViewById(R.id.layout2);
		mTextview = (TextView) findViewById(R.id.touch_textview);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public boolean onTouch(View v, MotionEvent event) {
		if (v == mLayout1) {
			Log.d("touch", "MainActivity Layout1 onTouch");
		} else if (v == mLayout2) {
			Log.d("touch", "MainActivity Layout2 onTouch");
		} else if (v == mTextview) {
			Log.d("touch", "MainActivity TouchTextview onTouch");
		}
		return false;
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean ret = super.onTouchEvent(event);
		int action = event.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:
			Log.d("touch", "MainActivity onTouchEvent() ACTION_DOWN");
			break;
		case MotionEvent.ACTION_MOVE:
			Log.d("touch", "MainActivity onTouchEvent() ACTION_MOVE");
			break;
		case MotionEvent.ACTION_UP:
			Log.d("touch", "MainActivity onTouchEvent() ACTION_UP");
			break;
		}
		Log.d("touch", "MainActivity onTouchEvent() return=" + ret);
		return ret;
	}
	
}
