package DataStructures;

import java.util.Scanner;

public class Java_SubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0 ; i<size; i++){
            array[i] = input.nextInt();
        }

        int counter = 0;

        for(int i = 0; i<size; i++){
            int sum = 0;
            for(int j = i; j < size; j++){
                sum += array[j];
                if(sum < 0){
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
