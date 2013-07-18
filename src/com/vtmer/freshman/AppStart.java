package com.vtmer.freshman;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;

import com.vtmer.freshman.ui.BaseActivity;

/**
 * 应用程序启动类：显示欢迎界面并跳转到主界面
 * @author shengbanx
 * @version 0.1
 * @created 2013-07-18
 */

public class AppStart extends BaseActivity {
    
	private Handler mHandler=new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final View view =View.inflate(this, R.layout.start, null);
		setContentView(view);
		Animation animation=AnimationUtils.loadAnimation(this,R.anim.alpha);
		view.startAnimation(animation);
		animation.setAnimationListener(new AnimationListener(){
			@Override
			public void onAnimationStart(Animation arg0){}
			@Override
			public void onAnimationRepeat(Animation arg0){}
			
			@Override
			public void onAnimationEnd(Animation arg0) {
				mHandler.postDelayed(new Runnable(){
					@Override
					public void run(){
						goHome();
					}
				},500);
			}
		});
	}

	/**
	 * 跳转到……
	 */
	
    protected void onResume(){
    	super.onResume();
    }
    
    private void goHome(){
    	openActivity(Main.class);
    	defaultFinish();
    }
}
