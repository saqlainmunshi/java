
class pow2num{
    public static void main(String[] args) {
        int n=4;
        if((n & (n-1))==0){
            System.out.printf("%d is  power of 2",n);
        }else{
            System.out.printf("%d not  power of 2",n);

        }
    }
}