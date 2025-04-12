

public class methodinSB {
    public static void main(String[] args) {
        String s ="Hello";
        StringBuilder sb = new StringBuilder(s);

        System.out.println("Initial: " + sb);

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(0): " + sb);

        sb.replace(0, 4, "Hi");
        System.out.println("After replace(0,4,\"Hi\"): " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        int cap = sb.capacity();
        System.out.println("Capacity: " + cap);

        sb.ensureCapacity(100);
        System.out.println("After ensureCapacity(100), Capacity: " + sb.capacity());

        int len = sb.length();
        System.out.println("Length: " + len);

        char c = sb.charAt(2);
        System.out.println("Char at index 2: " + c);

        sb.setCharAt(0, '!');
        System.out.println("After setCharAt(0, '!'): " + sb);

        String sub = sb.substring(0, 4);
        System.out.println("Substring(0, 4): " + sub);

        String result = sb.toString();
        System.out.println("toString(): " + result);

        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        int idx = sb.indexOf("o");
        System.out.println("indexOf(\"o\"): " + idx);

        int lastIdx = sb.lastIndexOf("l");
        System.out.println("lastIndexOf(\"l\"): " + lastIdx);

    
    }
}

