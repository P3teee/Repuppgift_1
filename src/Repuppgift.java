/**
 * Created by bepe14 on 2016-09-02.
 */
import java.util.Scanner;

public class Repuppgift {


        public static void main (String a[]){

            Scanner tgb = new Scanner(System.in);



            System.out.println("Skriv in ett nummer: ");
            int nummer1 = tgb.nextInt();
            System.out.println("Skriv in ett nummer: ");
            int nummer2 = tgb.nextInt();
            System.out.println("Skriv in ett nummer: ");
            int nummer3 = tgb.nextInt();
            System.out.println("Skriv in ett nummer: ");
            int nummer4 = tgb.nextInt();

            int[] numbers1 = {nummer1, nummer2, nummer3, nummer4};

            for(int i = 0; i < numbers1.length / 2; i++)
            {
                int temp = numbers1[i];
                numbers1[i] = numbers1[numbers1.length - i - 1];
                numbers1[numbers1.length - i - 1] = temp;
            }

            for (int i : numbers1) {
                System.out.print(i);
                System.out.print(", ");
            }


        }
    }

