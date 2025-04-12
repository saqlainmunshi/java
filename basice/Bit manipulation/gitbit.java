class gitbit{
    public static void main(String[] args) {
        // get bit by this we will get to know at give postion and five number witch bit is persent 1 or 0
        int n=5;
        int pos =3;
        int bitMask = 1<<pos;
        if ((bitMask & n)==0) {
            System.out.println("bit  is 0");
        }else{
            System.out.println("bit is 1");
        }
    }
}