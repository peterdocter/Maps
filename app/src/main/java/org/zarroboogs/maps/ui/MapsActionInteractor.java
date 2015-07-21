package org.zarroboogs.maps.ui;

/**
 * Created by wangdiyuan on 15-7-21.
 */
public interface MapsActionInteractor {
    interface OnMyLocationModeChangedListener {
        void onMyLocationChanged(int mode);
        void onFollowModeStoped();
    }

    void changeMyLocationMode(int mode ,OnMyLocationModeChangedListener listener);

    void stopFollowMode(OnMyLocationModeChangedListener listener);
}
