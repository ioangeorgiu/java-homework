import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GeorgiuIoanWeek3 {
    public static void main(String[] args){
        Week1Homework();
        Week2Homework();
    }
    public static void Week1Homework(){
//4a Primitive data types
        boolean superyacht = true;
        char name = 'A';
        int lengthMeters = 142;
        long beamMeters = 24;
        double grossTonnage = 12.558;
        System.out.println(superyacht);
        System.out.println(name);
        System.out.println(lengthMeters);
        System.out.println(beamMeters);
        System.out.println(grossTonnage);
//4b Non primitive data types
        String owner = "Andrey Melnichenko";
        int[] speedKnots = {16, 21};
        System.out.println(owner);
        System.out.println(speedKnots[1]);
//5a Define some integer variables and: increment it using the unary operator
        int day = 14;
        int month = 05;
        int year = 1991;
        System.out.println(++day);
        System.out.println(++month);
        System.out.println(++year);
//5b Perform some random arithmetic operations using the arithmetic operators
        int sum = day + month;
        int div = year / month;
        System.out.println(sum);
        System.out.println(div);
//5c Compare two variables using the comparison operator
        if(year > day)
            System.out.println("True!");
//6 Define two integer variables and compare the values

        int a = 14;
        int b = 5;
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (b > a) {
            System.out.println(b + " is larger than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
//7 Define a number array of 10 elements and print the values of every element on separate lines except 15
        int[] Array = {14, 5, 15, 19, 3, 1, 7, 11, 8, 17};
        for (int i:Array) {
            if(i == 15){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void Week2Homework(){
// 1
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = reader.nextLine();
        System.out.print("Enter the second string: ");
        String second = reader.nextLine();
        System.out.println();
        if (first.equals(second)) {
            System.out.println("The strings you entered are the same!");
        } else {
            System.out.println("The strings you entered weren't the same!");
        }
        String firstPlusSecond = first + second;
        System.out.println("The concatenated strings you entered are:" + firstPlusSecond);
// 2
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("The string is a palindrome.");

        else
            System.out.println("The string isn't a palindrome.");
// 3
        String emptyString = "";
        List<String> stringList = new ArrayList<>();
        ArrayList<String> stringArray = new ArrayList<>(5);
        stringList.add("Unu");
        stringList.add("DoI");
        stringList.add("TrEi");
        stringList.add("PAtrU");
        stringList.add("CincI");
// 4a
        HashMap<String, String> magazineOnline = new HashMap<>();
        magazineOnline.put("Emag", "emag@gmail.ro");
        magazineOnline.put("Evomag", "evomag@gmail.ro");
        magazineOnline.put("Pcgarage", "pcgarage@gmail.ro");
        magazineOnline.put("Altex", "altex@gmail.ro");
// 4b
        System.out.println("The size of magazineOnline is " + magazineOnline.size());
//4c
        System.out.println(magazineOnline.containsKey("Emag"));
// 4d
        System.out.println(magazineOnline.get("pcgarage@gmail.ro"));
//4e
        magazineOnline.remove("Altex");
        System.out.println("Remaining values are: " + magazineOnline);
// 4e
    }
}
