#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_abdul_bhaiya_secureapiusingndk_MainActivity_getApi(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "My Api key");
}

JNIEXPORT jstring JNICALL
Java_com_abdul_bhaiya_secureapiusingndk_MainActivity_getBaseUrl(JNIEnv *env, jobject thiz) {
return (*env)-> NewStringUTF(env, "Base Url");
}

JNIEXPORT jstring JNICALL
Java_com_abdul_bhaiya_secureapiusingndk_MainActivity_getEndPoint(JNIEnv *env, jobject thiz) {
return (*env)-> NewStringUTF(env, "End Point");
}

/*
 * You can write multiple methods here as your need As below
 *JNIEXPORT jstring JNICALL
 * com_abdul_bhaiya_secureapiusingndk_MainActivity_getApi2(JNIEnv *env, jobject instance) {

    return (*env)-> NewStringUTF(env, "My Api key");
}
 //method2... and so on.
 *
 * */
