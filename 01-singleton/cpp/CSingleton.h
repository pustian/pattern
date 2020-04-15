#ifndef C_SINGLETON_H
#define C_SINGLETON_H

#include<iostream>
using namespace std;

class CSingleton {
    private:
        CSingleton(){ cout<<"constructor"<<endl;}
        CSingleton(const CSingleton &copy) {cout<<"copy constructor"<<endl;}
        CSingleton& operator=(const CSingleton &assign){cout<<"assign construct"<<endl;}

        static CSingleton* myInstance;

    public:
        virtual ~CSingleton(){cout<<"destructor"<<endl;}

        static CSingleton* getInstance();
};

#endif
