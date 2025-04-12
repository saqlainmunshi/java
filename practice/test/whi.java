
import java.util.Scanner;

public class whi {
    public static void main(String[] args) {
        Scanner keyborad = new Scanner(System.in);
    //     final  byte a=10,b=20;
    //     while (a<b)
    // int x=0;
    int[] arr ={5,10,20,25,30};
    System.out.println("before");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("enter the number of values u wnat to change in array");
    int n  = keyborad.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("enter index u want to change");
        int index = keyborad.nextInt();
        System.out.println("enter the value");
        int value = keyborad.nextInt();
        arr[index]= value;
        
    }
    
    
    System.out.println("after");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+",");
    }
    }
}
