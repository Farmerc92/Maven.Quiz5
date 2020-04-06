package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        TreeSet<T> sortedInput = new TreeSet<>(originalSet);
        Iterator<T> iteratorSort = sortedInput.iterator();
        Set<HashSet<T>> output = new LinkedHashSet<>();
        output.add(new HashSet<>(originalSet));
        int count = originalSet.size();
        while(iteratorSort.hasNext() && count != 0){

        }
        Iterator<T> iterator = originalSet.iterator();
        output.add(new HashSet<>(Arrays.asList(iterator.next())));
        output.add(new HashSet<>(Arrays.asList(iterator.next())));
        output.add(new HashSet<>());
        return output;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

