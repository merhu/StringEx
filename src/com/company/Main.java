package com.company;

public class Main {

    public static void main(String[] args) {

        //replacing and removing String
        System.out.println("Write a method that will remove any given character from the String?");

        String str = "I love Java, not";
        System.out.println(" Before:" + str);

        //REPLACING
        str = str.replaceAll("not", "").replaceAll(",", ".");
        System.out.println(" After:" + str);

        //removal
        str = "@I2019hjds";
        System.out.println(" Before:" + str);

        str = str.replaceAll("[a-zA-Z0-9]", "");
        //removing letters and numbers except the symbols
        //use charat(^) to choose what to keep and remove
        System.out.println(" After:" + str);
        System.out.println(" ");

        System.out.println("How can we make String upper-case or lower-case?\n");
        System.out.println(" ");
        //Uppercase and lowerCase
        String input1 = "I LOVE JAVA";
        String input2 = "i also love java!";
        System.out.println(input1.toLowerCase());
        System.out.println(input2.toUpperCase());
        System.out.println(" ");

        System.out.println("How to compare two Strings in java program? ");
        System.out.println(" ");
        //How to compare two Strings in java program?
        String s1 = new String("Merhawit");
        String s2 = new String("Practice");
        String s3 = new String("Java");
        String s4 = new String("Java");
        String s5 = new String("java");

        // Comparing for String 1 != String 2
        System.out.println("Comparing " + s1 + " and " + s2
                + " : " + s1.equals(s2));

        // Comparing for String 3 = String 4
        System.out.println("Comparing " + s3 + " and " + s4
                + " : " + s3.equals(s4));

        // Comparing for String 4 != String 5
        System.out.println("Comparing " + s4 + " and " + s5
                + " : " + s4.equals(s5));

        // Comparing for String 1 != String 4
        System.out.println("Comparing " + s1 + " and " + s4
                + " : " + s1.equals(s4));

        System.out.println(" ");
        System.out.println("Converting String to Char");

        // Using charAt() method

        String s = "Merhawit";
        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            System.out.println("Character at " +i+ " Position: " + ch);
        }

        System.out.println(" ");
        System.out.println("Converting Char to String");

        // Method 1: Using toString() method
        char ch2 = 'b';
        String string1 = Character.toString(ch2);
        System.out.println("String is: "+string1);

        // Method 2: Using valueOf() method
        String string2 = String.valueOf(ch2);
        System.out.println("String is: "+string1);
        System.out.println(" ");
        System.out.println("String vs StringBuffer");

        //string vs string buffer
        String str1 = new String("Merhawit");
        str1 = str1.concat(" is awesome"); //links one string to the end of another string.
        System.out.println(str1);


        //stringbuffer
        StringBuffer sb = new StringBuffer("Merhawit");
        sb = sb.append(" is a student");
        System.out.println(sb);
    }
}


