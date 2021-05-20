/******************************************************
* Filename     : TestJni.cpp
* Last modified: 2021-05-20 15:35
* Author       : jzzh
* Email        : jzzh@szbaijie.cn
* Company site : http://www.szbaijie.cn/index.php
* Description  : 
******************************************************/
#include "com_aijiao_test_JNIDemo.h"
#include <iostream>
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_aijiao_test_JNIDemo_testHello
(JNIEnv *, jobject) {
	    printf("this is C++ print\n");
}
