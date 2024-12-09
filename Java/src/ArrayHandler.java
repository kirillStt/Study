import java.util.Random;
import java.util.Scanner;

class ArrayHandler {
    private int[] array;
    private int size;

    public ArrayHandler(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void fillArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101); // случайные числа от 0 до 100
        }
        size = array.length;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean searchElement(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void deleteElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс вне диапазона.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void insertElement(int element, int index) {
        if (index < 0 || index > size) {
            System.out.println("Индекс вне диапазона.");
            return;
        }
        if (size == array.length) {
            System.out.println("Массив полон.");
            return;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public int binarySearch(int element) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == element) {
                return mid;
            }
            if (array[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // элемент не найден
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getInfo() {
        return "Имя: " + firstName + ", Фамилия: " + lastName + ", Возраст: " + age;
    }
}

class PersonArray {
    private Person[] persons;
    private int size;

    public PersonArray(int capacity) {
        persons = new Person[capacity];
        size = 0;
    }

    public void addPerson(Person person) {
        if (size < persons.length) {
            persons[size++] = person;
        } else {
            System.out.println("Массив полон.");
        }
    }

    public boolean searchPerson(String firstName) {
        for (int i = 0; i < size; i++) {
            if (persons[i].getInfo().contains(firstName)) {
                return true;
            }
        }
        return false;
    }

    public void deletePerson(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс вне диапазона.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            persons[i] = persons[i + 1];
        }
        size--;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler(100);
        arrayHandler.fillArray();
        System.out.println("Содержимое массива:");
        arrayHandler.printArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент для поиска: ");
        int searchElement = scanner.nextInt();
        boolean found = arrayHandler.searchElement(searchElement);
        System.out.println(found ? "Элемент найден." : "Элемент не найден.");

        System.out.print("Введите индекс для удаления элемента: ");
        int deleteIndex = scanner.nextInt();
        arrayHandler.deleteElement(deleteIndex);
        System.out.println("Массив после удаления элемента:");
        arrayHandler.printArray();

        System.out.print("Введите элемент для вставки: ");
        int newElement = scanner.nextInt();
        System.out.print("Введите индекс для вставки: ");
        int insertIndex = scanner.nextInt();
        arrayHandler.insertElement(newElement, insertIndex);
        System.out.println("Массив после вставки элемента:");
        arrayHandler.printArray();

        System.out.print("Введите элемент для бинарного поиска: ");
        int binarySearchElement = scanner.nextInt();
        int resultIndex = arrayHandler.binarySearch(binarySearchElement);
        System.out.println(resultIndex != -1 ? "Элемент найден на индексе: " + resultIndex : "Элемент не найден.");

        // Работа с классом Person
        PersonArray personArray = new PersonArray(100);
        personArray.addPerson(new Person("Иван", "Иванов", 30));
        personArray.addPerson(new Person("Петр", "Петров", 25));
        personArray.addPerson(new Person("Сидор", "Сидоров", 40));

        System.out.println("Содержимое массива Person:");
        for (int i = 0; i < 3; i++) {
            System.out.println(personArray.persons[i].getInfo());
        }

        System.out.print("Введите имя для поиска: ");
        String searchName = scanner.next();
        boolean personFound = personArray.searchPerson(searchName);
        System.out.println(personFound ? "Человек найден." : "Человек не найден.");

        System.out.print("Введите индекс для удаления человека: ");
        int personDeleteIndex = scanner.nextInt();
        personArray.deletePerson(personDeleteIndex);
        System.out.println("Массив после удаления человека:");
        for (int i = 0; i < 2; i++) {
            System.out.println(personArray.persons[i].getInfo());
        }

        scanner.close();
    }
}