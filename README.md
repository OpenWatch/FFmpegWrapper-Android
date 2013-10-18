# FFmpegWrapper-Android

This is a lightweight wrapper around FFmpeg for Android.

## Work in progress
This library isn't yet ready for anyone to use... yet.

## Instructions

Before you get started, build FFmpeg for Android and generate a set of shared libraries and header files. [Check out our guide](https://github.com/OnlyInAmerica/FFmpeg-Android). Place the shared libraries in `libs/$PLATFORM_ARCH/` and the headers in `jni/include`.

**Important:** Until the Android Gradle plugin supports the NDK, use the script: `jni/ndk-build.sh` in place of `ndk-build`.
