package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return numberList.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return numberList.stream().filter(item -> item >= 20).collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        return null;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return null;
    }
}
