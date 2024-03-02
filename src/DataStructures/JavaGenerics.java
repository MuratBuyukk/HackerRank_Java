package DataStructures;

public class JavaGenerics {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        Printer printer = new Printer();

        printer.arrayPrinter(intArray);
        printer.arrayPrinter(stringArray);
    }
}

class Printer{
    public<T> void arrayPrinter (T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }
}
