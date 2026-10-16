package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String name1;
        name1= "Bob";
        String name2;
        name2= "Smith, ";
        String fullName = formatName(name1,name2);
        System.out.println(fullName);

    } public static String formatName( String name, String Lname) {
        return Lname + name;

    }
}
