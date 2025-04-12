public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, Java!  ";
        String str2 = "hello, java!";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring()
        System.out.println("Substring (7 to end): " + str.substring(7));
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));

        // 4. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 5. equals() and equalsIgnoreCase()
        System.out.println("Equals str2: " + str.equals(str2));
        System.out.println("Equals ignore case: " + str.equalsIgnoreCase(str2));

        // 6. startsWith() and endsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with '!  ': " + str.endsWith("!  "));

        // 7. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 8. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 9. replace()
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        // 10. split()
        String[] words = str.trim().split(", ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // 11. indexOf() and lastIndexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'a': " + str.lastIndexOf("a"));

        // 12. isEmpty()
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // 13. join()
        String joined = String.join(" - ", "Apple", "Banana", "Cherry");
        System.out.println("Joined String: " + joined);

        // 14. matches()
        System.out.println("Matches regex '.*Java.*': " + str.matches(".*Java.*"));

        // 15. toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("Characters in string:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 16. format()
        String formatted = String.format("My name is %s and I am %d years old.", "John", 25);
        System.out.println("Formatted String: " + formatted);

        // 17. repeat()
        System.out.println("Repeat 'Java' 3 times: " + "Java ".repeat(3));

        
        // 18. compareTo()
        String a = "Apple";
        String b = "Banana";
        String c = "Apple";

        System.out.println("Compare 'Apple' to 'Banana': " + a.compareTo(b)); // negative
        System.out.println("Compare 'Banana' to 'Apple': " + b.compareTo(a)); // positive
        System.out.println("Compare 'Apple' to 'Apple': " + a.compareTo(c)); // 0
        
    }
}
