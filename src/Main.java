import java.util.*;

public class Main {
    private static final int MAXIMUM_AGE = 99;

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
        // Первый путь решения
        List<Person> peoplesList = new ArrayList<>(List.of(someGuys));
        peoplesList.sort(new PeopleComparator());

        // Второй путь решения
        TreeSet<Person> ts = new TreeSet<>(new PeopleComparator());
        ts.addAll(List.of(someGuys));

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
