import java.util.*;

public class Main {
    // Константы для настройки
    private static final int MAXIMUM_AGE = 99;
    private static final int limitWordsInSurname = Integer.MAX_VALUE;

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
        peoplesList.sort((o1, o2) -> {
            int o1NumOfWords, o2NumOfWords;
            String[] sn1 = o1.getSurname().split(" ");
            String[] sn2 = o2.getSurname().split(" ");
            o1NumOfWords = sn1.length;
            o2NumOfWords = sn2.length;
            if (o1NumOfWords > limitWordsInSurname) {
                o1NumOfWords = limitWordsInSurname;
            }
            if (o2NumOfWords > limitWordsInSurname) {
                o2NumOfWords = limitWordsInSurname;
            }
            if (o1NumOfWords == o2NumOfWords) {
                return o2.getAge() - o1.getAge();
            } else {
                return o2NumOfWords - o1NumOfWords;
            }
        });

        System.out.print("\nСписок на входе:\n");
        for (Person person : someGuys) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
        System.out.print("\nСписок List:\n");
        for (Person person : peoplesList) {
            System.out.printf("Фамилия: %-25s, Возраст: %3d\n", person.getSurname(), person.getAge());
        }
    }
}
