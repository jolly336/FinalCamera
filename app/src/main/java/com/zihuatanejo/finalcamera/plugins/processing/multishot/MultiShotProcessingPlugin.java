package com.zihuatanejo.finalcamera.plugins.processing.multishot;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public abstract class MultiShotProcessingPlugin implements Handler.Callback, OnClickListener
{
	public abstract void setYUVBufferList(ArrayList<Integer> list);
	public abstract void onStartPostProcessing();
	public abstract void onStartProcessing(long sessionID);
	public abstract View getPostProcessingView();
	public abstract boolean onKeyDown(int keyCode, KeyEvent event);
}
