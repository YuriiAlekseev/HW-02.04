import java.util.ArrayList;
import java.util.List;

// Реализовать 2 метода класса Homework
// ```
// public class Homework {

// public static void main(String[] args) {
//     List<String> strings = new ArrayList<>();
//     strings.add("string");
//     strings.add("40");
//     strings.add("-5");
//     strings.add("my_string");
//     removeIntegers(strings);
//     System.out.println(strings); // [string, my_string]
// }

// static void removeEvenNumber(List<Integer> numbers) {
//     // TODO: 31.03.2023 Удалить все четные элементы из списка
// }

// static void removeIntegers(List<String> strings) {
//     // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
// }
// }
// ```

// Понять, что строка является числом, можно например так:

// try {
// Integer.parseInt("str");
// // число
// } catch (NumberFormatException e) {
// // не число
// }

public class hm {
    public static void main (String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
        removeEvenNumber(strings);
    }
    static void removeEvenNumber(List<String> strings) {
    // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = 0; i < strings.size(); i++) {
            if (i % 2 != 0 ){
                strings.remove(i);
            }
        }
        System.out.println(strings);
    }

    static void removeIntegers(List<String> strings) throws NumberFormatException {
     // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
    //  try {
    //     Integer.parseInt(strings);
    //     System.out.println("число");
    //  }
    // catch (NumberFormatException e) {
    //     System.out.println("не число");
    // }
    // for (int i = 0; i < strings.size(); i++) {
    //     char x = String strings (i);
    //     System.out.println(Character.isDigit(x));
                   // try {
        //     int x = Integer.parseInt(String s);
        //     System.out.println(i);
        //  }
        // catch (NumberFormatException e) {
        //     System.out.println("не число");
        }
    //     Integer tmp = Integer.parseInt(strings.get(i));
    //     if (strings.get(i).equals(tmp)){
    //         strings.remove(i);
        }
    // String digits = strings.replaceAll("[^0-9.]", "");

    // System.out.println(strings);
    }

}


