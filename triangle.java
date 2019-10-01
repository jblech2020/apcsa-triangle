/**
* @author Jaedan Blechinger
*/

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        *
        *Excercise 2 - Triangle
        */

        System.out.print("\nEnter the height of a triangle: ");
        double triHeight= in.nextInt();
        System.out.print("Enter the base of a triangle: ");
        double base= in.nextInt();
        double triArea = (base * triHeight) / 2;
        System.out.printf("\n%s %,.1f %s %,.1f %s %,.1f%s\n", "The area of a triangle with a height and base of", triHeight, "and", base, "is", triArea, ".");

        in.close();
    }
}
