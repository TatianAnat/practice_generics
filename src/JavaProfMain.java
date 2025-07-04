import java.util.ArrayList;
import java.util.Arrays;

public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        //создаём массив из 3-х элементов
        int[] arr = {1,2,3};
        //увеличиваем созданный массив в два раза
        arr = Arrays.copyOf(arr, arr.length*2);
        //чтоб смогли добавить данный элемент
        arr[3] = 4;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        //чтоб не думать, что нам нужно расширять массив, мы используем
        //ArrayList типа сосуда, который будет пополняться
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        System.out.println("strings = " + strings);
        strings.add("4");
        System.out.println("strings = " + strings);

        for (String s: strings) {
            System.out.println(s.length());
        }

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);

        for (Integer i: intList) {
            System.out.println(i*i);
        }
    }
}