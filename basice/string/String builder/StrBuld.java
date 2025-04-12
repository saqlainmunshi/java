

public class StrBuld {
    public static void main(String[] args) {
        String s ="namw";
        s = s+"h";
        // in heap memory the namw will stay as it is and s will point to namwh to new location witch will be time taking and over use of memory for short time
        System.out.println(s);
        // by using string builder the promble is solved
        StringBuilder sb = new StringBuilder("saqlian");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        // we can set element at any postion by replaceing it
        sb.setCharAt(0, 'e');
        System.out.println(sb);
        // we can set element at any postion by shifting the current postion
        sb.insert(1, " s");
        System.out.println(sb);
        // we can delete the sub strig as well
        sb.delete(0, 2);
        System.out.println(sb);
        // we append as well
        sb.append(" munshi");
        System.out.println(sb);   
        
    }
}
