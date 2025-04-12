public class Parallelogram{
    public static void main(String[] args) {
        int n=9;
        // for(int i=1;i<=n;i++){
        //     for (int j = 1; j <= n*2; j++) {
        //         for (int k = 0; k < n; k++) {
        //             System.out.print(" ");
        //         }
               
        //         for (int k = 0; k < n; k++) {
        //             System.out.print("*");
        //         }
               
        //     }
        // }
        for(int i=1;i<=n;i++){
                for (int k = 0+i; k < n; k++) {
                    System.out.print(" ");
                }
                
                for (int k = 0; k < n; k++) {
                    if(i==1||i==n||k==0||k==n-1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
               
            System.out.println();
        }
    }
}