#include<bits/stdc++.h>
using namespace std;

int main(){
    int numtimes, i=0, twosquare=1,num=0, j;
    cin >> numtimes;
    for (i=0; i<numtimes; i++){
        j=0, twosquare=1;
        cin >> num;
        if (num == 0){
            cout << 0 << endl;
            continue;
        }
        while (num >= twosquare){
            // cout << "hey";
            twosquare = pow(2, j);
            j++;
        }
        cout << pow(2, (j-2))-1 << endl;
    }
    return 0;
}
