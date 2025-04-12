public class StrCompare {
    public static void main(String[] args) {
        String name1= "saqlain";
        String name2= "saqlains";
        /*
        s1>s2: +value
        s1=s2: 0
        s1<s2: -value
        */
        if (name1.compareTo(name2)==0) {
            System.out.println("string are equal");
        }else{
            System.out.println("not equal");
        }
    }
}
