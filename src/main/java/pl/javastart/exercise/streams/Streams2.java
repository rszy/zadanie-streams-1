package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        return ppl.stream().filter(person -> person.getAge() < 18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        return people.stream()
                .map(person -> new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()))
                .collect(Collectors.toList());
    }
}
