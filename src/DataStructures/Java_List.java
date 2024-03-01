package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints



Each element in is a 32-bit integer.
Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*/

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
