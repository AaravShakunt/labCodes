#include <iostream>
using namespace std;
const int MAX=3;

class CQs{
    private:
    int f, r, arr[MAX];

    public:
    CQs(){
        f=r=-1;
    }
    int isEmpty(){
        if ((f)==(r)){
            cout<<"Queue empty";
            return 0;
        }
        return 1;
    }
    bool isFull(){
        if ((f%MAX)-1==(r%MAX)){
            cout<<"Queue full";
            return true;
        }
        cout<<"hello";
        return false;
    }
    void display(){
        if (!isEmpty()){
            for(int i=f+1; i<=r;i++)
                cout<<arr[i];
        }
    }
    void enq(int num){
        // int flag = isFull();
        if (!isFull()){
            arr[++r] = num;
        }
    }
};

int main(){
    CQs q1;
    q1.enq(3);
    q1.enq(4);
    q1.display();
    return 0;
}