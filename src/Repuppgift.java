/**
 * Created by bepe14 on 2016-09-02.
 */
import java.util.Scanner;

public class Repuppgift {
    public static int[] sortering(int[] numbers) {


        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] > numbers[index])
                    index = j;

                    int mindrenumber = numbers[index];
                    numbers[index] = numbers[i];
                    numbers[i] = mindrenumber;
                }
            return numbers;
        }

        public static void main(String a[]) {

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
            int[] numbers2 = sortering(numbers1);
            for(int i:numbers2){
                System.out.print(i);
                System.out.print(", ");
            }


        }
    }

