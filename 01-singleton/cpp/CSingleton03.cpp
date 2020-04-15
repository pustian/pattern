#include <iostream>
#include "CSingleton.h"
using namespace std;

// 饥汉模式
CSingleton* CSingleton::myInstance = new CSingleton();

CSingleton* CSingleton::getInstance() {
    return myInstance;
}
