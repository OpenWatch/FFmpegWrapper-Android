#include <jni.h>
#include <android/log.h>


#define LOG_TAG "FFmpegWrapper"
#define LOGI(...)  __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...)  __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

void Java_net_openwatch_ffmpegwrapper_FFmpegWrapper_test(JNIEnv * env, jobject this){
    LOGI("What's up?");
}
