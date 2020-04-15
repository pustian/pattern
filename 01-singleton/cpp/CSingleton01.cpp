#include <iostream>
#include "CSingleton.h"
using namespace std;

// 懒汉模式，线程不安全
CSingleton* CSingleton::myInstance = NULL;

CSingleton* CSingleton::getInstance() {
    if(myInstance == NULL) {
        myInstance = new CSingleton();
    }
    return myInstance;
}
