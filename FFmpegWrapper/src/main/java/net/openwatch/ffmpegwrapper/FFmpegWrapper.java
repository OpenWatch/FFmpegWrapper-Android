package net.openwatch.ffmpegwrapper;

/**
 * Created by davidbrodsky on 10/17/13.
 */
public class FFmpegWrapper {

    static {
        System.loadLibrary("FFmpegWrapper");
    }

    public static native void test();
}
