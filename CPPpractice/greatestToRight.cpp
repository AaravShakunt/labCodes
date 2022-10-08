#include<iostream>
#include<stack>
#include<vector>
using namespace std;


int main(){
    cout<<"input array: ";
    stack<int> stk;
    vector<int> vec;
    int m;
    cin>>m;
    while ((m)!=-1){
        vec.push_back(m);
        cin>>m;
    }

    for (int i=vec.size()-1;i>=0;i--){
        
        if (stk.empty()){
            cout<<"-1"<<" ";
            stk.push(vec[i]);
            continue;
        }
        // else if (stk.top()>vec[i]){
        //     cout<<stk.top()<<" ";
        // }
        else if (stk.top()<=vec[i]){
            
            while(stk.top()<=vec[i]){
                // cout<<stk.top();
                
                stk.pop();
                if (stk.empty())
                    break;
                // cout<<stk.top();
            }
            // cout<<"yello";

        }
        if (stk.empty()){
            cout<<"-1"<<" ";
            // continue;
        }
        else{
            cout<<stk.top()<<" ";
        }
        stk.push(vec[i]);

    }
    
    return 0;
}