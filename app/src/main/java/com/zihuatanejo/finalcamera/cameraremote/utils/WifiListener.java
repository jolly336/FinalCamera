package com.zihuatanejo.finalcamera.cameraremote.utils;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;

import java.util.List;

public interface WifiListener {

	void onWifiConnecting(String ssid);
	void onWifiConnected(String ssid);
	void onWifiDisconnected();
	
	void onWifiStartScan();
	void onWifiScanFinished(List<ScanResult> sonyCameraScanResults,
							List<WifiConfiguration> sonyCameraWifiConfiguration);

}
