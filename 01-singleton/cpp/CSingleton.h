#ifndef C_SINGLETON_H
#define C_SINGLETON_H

#include<iostream>
using namespace std;

class CSingleton {
    private:
        CSingleton(const CSingleton &copy) {cout<<"copy"<<endl;}
        CSingleton& operator=(const CSingleton &assign){cout<<"assign"<<endl;}

        CSingleton(){ cout<<"created"<<endl;}
        static CSingleton myInstance;

        virtual ~CSingleton(){cout<<"destuctor"<<endl;}
    public:

        static CSingleton *getInstance() {
            return &myInstance;
        }
};

#endif
