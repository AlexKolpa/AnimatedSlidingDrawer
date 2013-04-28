package com.example.slidingdrawertest;

import widget.SlidingDrawer;
import widget.SlidingDrawer.DrawerContentAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;

public class DrawerTest extends Activity {

	SlidingDrawer drawer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drawer_test);

		View content = (View) findViewById(R.id.main_content);
		drawer = (SlidingDrawer) findViewById(R.id.SlidingDrawer);

		DrawerContentAnimator animator = drawer.new DrawerContentAnimator(
				AnimationUtils.loadAnimation(this, R.anim.fade_in_main),
				AnimationUtils.loadAnimation(this, R.anim.fade_out_main),
				content);
		drawer.setOnDrawerScrollListener(animator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_drawer_test, menu);
		return true;
	}
}
