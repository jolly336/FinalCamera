/* <!-- +++
package com.zihuatanejo.finalcamera_plus.ui;
+++ --> */
//<!-- -+-
package com.zihuatanejo.finalcamera.opencam.ui;
//-+- -->


import android.content.Context;
import android.view.Window;

import com.zihuatanejo.finalcamera.R;
import com.zihuatanejo.finalcamera.ui.RotateDialog;
import com.zihuatanejo.finalcamera.ui.RotateLayout;


/* <!-- +++
import com.zihuatanejo.finalcamera_plus.R;
+++ --> */
//<!-- -+-
//-+- -->

public class SonyCameraDeviceExplorerDialog extends RotateDialog
{
	public SonyCameraDeviceExplorerDialog(Context context)
	{
		super(context);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.opencamera_sony_device_discovery);
	}

	@Override
	public void setRotate(int degree)
	{
		degree = degree >= 0 ? degree % 360 : degree % 360 + 360;

		currentOrientation = degree;

		RotateLayout r = (RotateLayout) findViewById(R.id.rotateSonyCameraExplorerDialog);
		if (r != null) {
			r.setAngle(degree);
			r.requestLayout();
			r.invalidate();
		}
	}
}
