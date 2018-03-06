package home.korolyuk;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by admin on 2/9/2018.
 */
public class homeTask2_1 {
    public static void main(String[] args) {
        String str1 = "Курс: Java Core";
        String str2 = "студент";
        Scanner FIO = new Scanner(System.in);
        String strFIO = FIO.nextLine();
        int flLength = strFIO.length() + 3;

        for (int i = 0; i <= flLength; i++ ){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*");
        for (int i = 0; i <= (strFIO.length() - str1.length())/2; i++ ){
            System.out.print(" ");
        }

        System.out.print(str1);
        for (int i = 0; i <= (strFIO.length() - str1.length())/2; i++ ){
            System.out.print(" ");
        }
        System.out.println(" *");
        System.out.print("*");
        for (int i = 0; i <= (strFIO.length() - str2.length())/2; i++ ){
            System.out.print(" ");
        }

        System.out.print(str2);
        for (int i = 0; i <= (strFIO.length() - str2.length())/2; i++ ){
            System.out.print(" ");
        }
        System.out.println(" *");
        System.out.println("* " + strFIO + " *");
        for (int i = 0; i <= flLength; i++ ){
            System.out.print("*");
        }


        //*System.out.println();
    }

}
