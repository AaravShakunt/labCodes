#include<bits/stdc++.h>
#include<string>
using namespace std;

int main(){
    int numtimes, i=0, solution;
    // scanf("%d",&numtimes);
    cin >> numtimes;
    // cout << numtimes;
    for (i=0; i<numtimes; i++){
        // cout << "hello";
        solution = 0;
        string s, s_sorted;
        int stringlen;
        // scanf("%d",&stringlen);
        cin >> stringlen;
        // scanf("%s", &s);
        cin >> s;
        s_sorted = s;
        sort(s_sorted.begin(), s_sorted.end());
        // cout << s_sorted;
        for (int j=0; j<stringlen; j++){
            if (s[j]!= s_sorted[j]){
                solution = solution + 1;
                // cout << s[i];
            }
        }
        cout << solution << "\n";   
    }
    return 0;
}