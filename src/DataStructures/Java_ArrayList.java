package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;
/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
 */

public class Java_ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList> lineList = new ArrayList<ArrayList>();

        int numberOfLines = input.nextInt();
        for(int i = 0; i< numberOfLines; i++ ){
            ArrayList<Integer> elementList = new ArrayList<Integer>();
            int numberOfElements = input.nextInt();

            for(int j = 0 ; j<numberOfElements; j++){
                elementList.add(input.nextInt());
            }
            lineList.add(elementList);
        }

        int numberOfQueries = input.nextInt();

        for(int i = 0; i<numberOfQueries; i++){
            int line = input.nextInt() - 1;
            int element = input.nextInt() - 1;
            if((line >= 0 && line < lineList.size())
                    && (element >= 0 && element < lineList.get(line).size())){
                System.out.println(lineList.get(line).get(element));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}
