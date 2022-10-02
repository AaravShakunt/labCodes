#include<bits/stdc++.h>
using namespace std;

int main(){
    int i=0, solution, num, newnum, tempnum, j=0;   
    cin >> num;
    unsigned int count = 0;
    while (num) {
        count += num & 1;
        num >>= 1;
    }

    cout << count << endl;
    return 0;
}