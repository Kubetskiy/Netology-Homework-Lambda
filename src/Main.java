import java.util.*;

public class Main {
    private static final int MAXIMUM_AGE = 50;
    private static final int MINIMUM_AGE = 18;


    public static void main(String[] args) {
        Random random = new Random();
        Person[] someGuys = new Person[]{
                new Person("Вова", "Давай закурим", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Вася", "Пупкин", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Толя", "От работы кони дохнут", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Миша", "Работа не волк", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Коля", "Слава труду", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Валя", "Попытка не пытка", random.nextInt(MAXIMUM_AGE) + 1),
                new Person("Ваня", "Дурак", random.nextInt(MAXIMUM_AGE) + 1)
        };

        List<Person> peoplesList = new ArrayList<>(List.of(someGuys));
        peoplesList.removeIf(person -> person.getAge() < MINIMUM_AGE);

        System.out.print("\nСписок на входе:\n");
        for (Person person : someGuys) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок List:\n");
        for (Person person : peoplesList) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок TreeSet:\n");
        for (Person person : ts) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
    }
}
