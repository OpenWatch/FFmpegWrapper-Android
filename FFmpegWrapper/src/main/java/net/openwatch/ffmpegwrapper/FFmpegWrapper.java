package net.openwatch.ffmpegwrapper;

import android.util.Log;

/**
 * Created by davidbrodsky on 10/17/13.
 */
public class FFmpegWrapper {

    static {
        System.loadLibrary("FFmpegWrapper");
        Log.i("NDK", "loaded library");
    }

    public native int test();
}
