#include<bits/stdc++.h>
using namespace std;

int main(){
    // int numtimes, i=0, solution, num, newnum, tempnum, j=0;
    int numtimes, i=0, twosquare=1,num=0, j;
    // scanf("%d",&numtimes);
    cin >> numtimes;

    for (i=0; i<numtimes; i++){
        j=0;
        cin >> num;
        while (num >= twosquare){
            // cout << "hey";
            twosquare = pow(2, j);
            j++;
        }
        cout << (int)pow(2, (j-2))-1 << endl;
    }
    return 0;
}
