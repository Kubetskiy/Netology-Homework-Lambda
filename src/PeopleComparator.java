import java.util.Comparator;

public class PeopleComparator implements Comparator<Person> {

    private int limitWordsInSurname = Integer.MAX_VALUE;

    public PeopleComparator(int wordsInSurname) {
        if (wordsInSurname > 0) {
            this.limitWordsInSurname = wordsInSurname;
        }
    }

    public PeopleComparator() {
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
