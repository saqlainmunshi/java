public class TraString {
    public static void main(String[] args) {
        String fname = "saqlain";
        String lname = "munshi";
        String fullname = fname +" " + lname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for (int i = 0; i < fullname.length(); i++) {
            if (fullname.charAt(i)!='s') {
                
                System.out.print(fullname.charAt(i));
            }
            
        }
    }
}
