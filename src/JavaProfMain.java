import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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

        new House<>(cats).whoIsHere();

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("jack","orange"));
        dogs.add(new Dog("muhtar","brown"));
//можно в дженериках не писать House<Dog>, а оставлять пустым <>
        new House<>(dogs).whoIsHere();

        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("1");
        linkedStrings.add("2");
        linkedStrings.add("3");
        linkedStrings.remove(0);
        //выводим весь список
        System.out.println("LinkedStrings = " + linkedStrings);
        //выводим первый элемент
        System.out.println("LinkedStrings = " + linkedStrings.get(0));

        ArrayList<String> arrayStrings = new ArrayList<>();
        arrayStrings.add("1");
        arrayStrings.add("2");
        arrayStrings.add("3");
        arrayStrings.remove(0);
        System.out.println("arrayStrings = " + arrayStrings);
        System.out.println("arrayStrings = " + arrayStrings.get(0));

    }
    public static class Cat implements Animal {
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

        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    public interface Animal {
        void sound();
    }

    public static class Dog implements Animal {
        private String name;
        private String color;

        public Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        @Override
        public void sound() {
            System.out.println("woof");
        }
    }

    private static class House<A extends Animal> {
        private List<A> animals;

        public House(List<A> animals) {
            this.animals = animals;
        }

        public void whoIsHere() {
            for (Animal a: animals) {
                a.sound();
            }
        }

        @Override
        public String toString() {
            return "Дом для животных, живут: " + animals;
        }

    }
}