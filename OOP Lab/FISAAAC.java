import java.util.Scanner;

public class fisac {
    static int[] getDifference(int arr2[], int arr1[]){
        // System.out.println(arr1[0]+" "+arr2[1]);
        int arr3[] = {0 , 0};
        if(arr1[0]-arr2[0]<0){
            arr1[0]+=24;
        }
        if (arr1[1]-arr2[1]>=0){
            arr3[1] = arr1[1]-arr2[1]; 
            arr3[0] = arr1[0]-arr2[0]; 
        }
        else{
            arr3[1] = arr1[1]-arr2[1]+60;
            arr3[0] = arr1[0]-arr2[0]-1;
        }
        // System.out.println(arr3[0]+':'+arr3[1]);
        return arr3;
    }

    static int calculatePrice(int arr1[]){
        int price = 20;
        if (arr1[0]==0&&arr1[1]==0){
            return price;
        }
        else if (arr1[0]==0){
            return price+5;
        }
        else if (arr1[1]==0){
            price = price - 1 + (6*arr1[0]);
            return price;
        }
        else{
            price = price - 1 + (6*arr1[0]) + 6;
            return price;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inTime, outTime;
        int inTimeInt[], outTimeInt[], DiffTimeInt[];
        inTimeInt = new int[2];
        outTimeInt = new int[2];
        int hIn, mIn, hOut, mOut;
        System.out.println("Enter entry time: ");
        inTime = sc.nextLine();
        System.out.println("Enter exit time: ");
        outTime = sc.nextLine();
        String[] arrIn, arrOut;
        arrIn = inTime.split(":");
        arrOut = outTime.split(":");
        // System.out.println(arrIn[0]+'\n'+arrOut[1]);
        for (int i=0;i<2;i++){
            // System.out.println(arrIn[i]+'\n'+arrOut[i]);
            inTimeInt[i] =  Integer.parseInt(arrIn[i]);
            outTimeInt[i] =  Integer.parseInt(arrOut[i]);
            // System.out.println(inTimeInt[i]+'\n'+outTimeInt[i]+'\n');
        }
        
        DiffTimeInt = getDifference(inTimeInt, outTimeInt);
        System.out.println(DiffTimeInt[0]+" "+DiffTimeInt[1]);
        int price = calculatePrice(DiffTimeInt);
        System.out.println(price);
        sc.close();
    }
}
