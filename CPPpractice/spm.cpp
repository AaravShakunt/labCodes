#include <iostream>
using namespace std;
const int MAX=300;

class SpM{
private:
    int m,n,ele;
public:
    int r, c, v;
    void read(SpM a[]){
        cout<<"Enter dimensions";
        cin>>m>>n;
        int k=1;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                cin>>ele;
                if (ele==0)
                    continue;
                a[k].r = i;
                a[k].c = j;
                a[k].v = ele;
                k++;
            }
        }
        a[0].r=m;
        a[0].c=n;
        a[0].v=k-1;
    }

    void display(SpM a[]){
        for (int i=0;i<=a[0].v;i++){
            cout<<a[i].r<<" "<<a[i].c<<" "<<a[i].v<<'\n';
        }
    }
    void transpose(SpM a[]){
        SpM b[MAX];
        int k=1;
        b[0].r=a[0].c;
        b[0].c=a[0].r;
        b[0].v=a[0].v;

        for (int i=0;i<a[0].c;i++){
            for (int j=1;j<=a[0].v;j++){
                if (a[j].c==i){

                    b[k].r=a[j].c;
                    b[k].c=a[j].r;
                    
                    b[k].v=a[j].v;
                    k++;
                }
            }
        }
        b[0].display(b);


    }
    fTranspose(SpM a[], SpM b[]){
        
    }
};


int main(){
    SpM spm[MAX];
    spm[0].read(spm);
    spm[0].display(spm);
    cout<<"TRANSPOSE"<<'\n';
    spm[0].transpose(spm);

}