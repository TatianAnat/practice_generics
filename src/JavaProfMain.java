import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("mart","white"));
        cats.add(new Cat("tapok","black"));

        System.out.println(new House<Cat>(cats));
    }
    public static class Cat {
        private String name;
        private String color;

        public Cat(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    private static class House<A> {
        private List<A> animals;

        public House(List<A> animals) {
            this.animals = animals;
        }

        @Override
        public String toString() {
            return "Дом для животных, живут: " + animals;
        }

    }
}