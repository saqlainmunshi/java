import java.util.Arrays;

public class test {
    //User function Template for Java

    int solve(String s, int K) 
    { 
        char[] srr = s.toCharArray();
        char[] crr = s.toCharArray();
        int n= srr.length;
        for(int i=0;i<n;i++){
            if(crr[i]=='1'){
            //     for(int j=0;j<(2*K)+1;j++){
            //         int index =(i-K)+j;
                    
            //         if(index>=0 && index<n){
                        
            //         srr[index]='1';
            //         }
            //     }
            if(i-K>=0 && i+K+1 <= srr.length)
            Arrays.fill(srr,i-K,i+K+1,'1');
            
            }
            
            
        }
        int count=0;
        for(int i=0;i<srr.length;i++){
            if(srr[i]=='1'){
                count++;
            }
        }
        return count;
    }
} 

