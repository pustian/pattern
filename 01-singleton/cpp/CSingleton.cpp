#include <iostream>
#include "CSingleton.h"
using namespace std;

CSingleton CSingleton::myInstance;

int main() {
    CSingleton *t1 = CSingleton::getInstance();
    
//    CSingleton *t2 = CSingleton::getInstance();
//    CSingleton *t3 = CSingleton::getInstance();
    return 0;
}
