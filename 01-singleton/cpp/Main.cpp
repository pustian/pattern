#include <iostream>
#include <pthread.h>
#include "CSingleton.h"
using namespace std;

int main() {
    int i = 0;
    CSingleton* p[4];
    while(i < 4) {
        p[i] = CSingleton::getInstance();
	printf("%p\n", p[i]);
	++i;
    }

    delete p[i-1];
    
    return 0;
}
