package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        List<Set<T>> output = new ArrayList<>();
        TreeSet<T> sortedInput = new TreeSet<>(originalSet);
        output.add(sortedInput);
        List<T> list = new ArrayList<>(originalSet);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.size() > 2)
                    output.add(new LinkedHashSet<>(Arrays.asList(list.get(i), list.get(j))));
            }
            output.add(new HashSet<>(Collections.singletonList(list.get(i))));
        }
        output.add(new HashSet<>());
        return output;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }

}

