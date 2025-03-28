package ex_14_StringBuffer_Builder_StringFunctions;

import java.util.Locale;

public class Lab112_String_Functions {
    public static void main(String[] args)

    {
      String name = "Johnson";
        System.out.println(name.length());
        System.out.println(name.charAt(4));

        // System.out.println(name.charAt(10));     // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat("kumar"));

       // 3. contains()
        System.out.println(name.contains("son"));
        System.out.println(name.contains("krns"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("johnson"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('s'));


        // Returns the index within this string of the
        // first occurrence of the specified substring.
        String s1 = "madam";
        System.out.println(s1.indexOf("a"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('J', 'j'));

        // 9. split()
         String name1 = "pooja@live.com@123";
         String[] split = name1.split("@");
         System.out.println(split[0]);
         System.out.println(split[1]);
         System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(5,7));

        // 11. toLowerCase()
        System.out.println("SHERYA".toLowerCase(Locale.ROOT));


        // 11. toUpperCase()
        System.out.println("shreya".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("J"));

        // 15. endsWith()
        System.out.println(name.endsWith("n"));

        // 16. trim()
        String name2 = "   Disha    ";
        System.out.println(name2.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Johnson"));

        StringBuilder stringBuilder = new StringBuilder("sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String s2 = "sanjay";
        System.out.println(s2.concat("Dutta"));


        //concatenation
        String s11 = "Hi";
        String s12 = "Hello";
        String s13 = "bye";
        String result = s11+s12+s13;
        System.out.println(result);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));


    }

}


