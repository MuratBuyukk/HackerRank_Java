package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int indexLength = input.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<indexLength; i++){
            list.add(input.nextInt());
        }

        int querryLength = input.nextInt();
        for (int i = 0; i< querryLength; i++){

            String querryType = input.next();
            int index = input.nextInt();
            if(querryType.equals("Insert")){
                int element = input.nextInt();
                list.add(index, element);
            }else{
                list.remove(index);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
