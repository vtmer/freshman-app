package com.vtmer.freshman.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.vtmer.freshman.R;


public class BaseActivity extends Activity{
	
	@Override
	protected void onStart() {
	super.onStart();
	}

	protected void openActivity(Class<?> pClass) {
		openActivity(pClass, null);
	}

	protected void openActivity(Class<?> pClass, Bundle pBundle) {
		Intent intent = new Intent(this, pClass);
		if (pBundle != null) {
			intent.putExtras(pBundle);
		}
		startActivity(intent);
	}

	protected void openActivity(String pAction) {
		openActivity(pAction, null);
	}

	protected void openActivity(String pAction, Bundle pBundle) {
		Intent intent = new Intent(pAction);
		if (pBundle != null) {
			intent.putExtras(pBundle);
		}
		startActivity(intent);
	}
	
	public void finish()
	{
		super.finish();
		overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
	}

	public void defaultFinish()
	{
		super.finish();
	}
}
