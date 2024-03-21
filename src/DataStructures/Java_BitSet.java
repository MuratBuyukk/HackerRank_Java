package DataStructures;

import java.util.BitSet;
import java.util.Scanner;
/*
Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
The  subsequent lines each contain an operation in one of the following forms:

AND
OR
XOR
FLIP
SET
In the list above,  is the integer  or , where  denotes  and  denotes .
 is an integer denoting a bit's index in the BitSet corresponding to .

For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

AND 2 1
 is the left operand, and  is the right operand. This operation should assign the result of  to .

Constraints

Output Format

After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.

Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output

0 0
1 0
1 1
1 2

 */
public class Java_BitSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bitSetlength = input.nextInt();
        int numberOfOperation = input.nextInt();
        BitSet[] bitSets = new BitSet[2];
        bitSets[0] = new BitSet(bitSetlength);
        bitSets[1] = new BitSet(bitSetlength);
        input.nextLine();
        for(int i =0; i<numberOfOperation;i++){
            String[] inputLine = input.nextLine().split(" ");
            int xIndex = Integer.parseInt(inputLine[1]) - 1;
            int yIndex = Integer.parseInt(inputLine[2]) - 1;
            switch(inputLine[0]){
                case "AND":
                    bitSets[xIndex].and(bitSets[yIndex]);
                    break;
                case "OR":
                    bitSets[xIndex].or(bitSets[yIndex]);
                    break;
                case "XOR":
                    bitSets[xIndex].xor(bitSets[yIndex]);
                    break;
                case "FLIP":
                    bitSets[xIndex].flip(yIndex+1);
                    break;
                case "SET":
                    bitSets[xIndex].set(yIndex+1);
                    break;
            }
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
    }
}
