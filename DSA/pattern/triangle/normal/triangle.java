

public class triangle {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
                
            }
            System.out.println();
        }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j < n*2; j++) {
        //         if (i+j>=n+1&&j-i<=n-1&&(j+i)%2==0) {
                    
        //             System.out.print(i);
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
