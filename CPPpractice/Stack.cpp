#include<iostream>
using namespace std;
const int MAX=100;

class Stk{
    private:
    int top;
    char arr[MAX];
    public:
    Stk(){
        top=-1;
    }
    int isEmpty(){
        if (top==-1){
            return 1;
        }
        else{
            return 0;
        }
    }
    int isFull(){
        if (top==MAX-1)
            return 1;
        return 0;
    }
    void push(char elem){
        if (isFull()){
            cout<<"Stack Overflow";
        }
        else{
            arr[++top]=elem;
        }
    }
    char pop(){
        if (isEmpty()){
            cout<<"underflow";
        }
        else{
            return arr[top--];
        }
    }
    void display(){
        if (isEmpty()){
            cout<<"underflow";
        }
        else{
            for (int i=top; i>=0; i--)
                cout<<arr[i];
        }
        
    }
};

int main(){
    Stk s1;
    int i;
    char a[100], b[100];

    cin.getline(a, 100);
    // cout<<a;

    for (i=0; a[i]!='\0';i++){
        s1.push(a[i]);
    }
    for (i=0; a[i]!='\0';i++){
        b[i]=s1.pop();
    }
    b[++i]='\0';
    for (int i=0; a[i]!='\0';i++){
        if (a[i]==b[i]){
            continue;
        }
        else{
            cout<<"not palindrome";
            return 0;
        }
    }
    cout<<"palindrome";
    return 1;
}