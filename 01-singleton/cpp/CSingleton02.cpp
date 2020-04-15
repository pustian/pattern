#include <iostream>
#include <mutex>
#include "CSingleton.h"
using namespace std;

// 懒汉模式 多线程安全 DCL
CSingleton* CSingleton::myInstance = NULL;

CSingleton* CSingleton::getInstance() {
    mutex mut;
    if(myInstance == NULL) {
	mut.lock();
        if(myInstance == NULL) {
            myInstance = new CSingleton();
	}
	mut.unlock();
    }
    return myInstance;
}
