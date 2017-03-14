package pl.javastart.exercise.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams1 {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return numberList.stream().filter(n -> n > 20).collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        return titles.stream().map(new Function<String, Book>() {
            @Override
            public Book apply(String title) {
                return new Book(title) ;
            }
        }).collect(Collectors.toList());
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return convertToBooks(titles).stream().filter(title -> title.getTitle().startsWith("Gra")).collect(Collectors.toList());
    }
}
