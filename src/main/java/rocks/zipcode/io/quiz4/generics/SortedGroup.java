package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable<_>> extends Group<_> {
    @Override
    public void insert(_ value) {
        list.add(value);
        Collections.sort(list);
    }

    @Override
    public void delete(_ value) {
        list.remove(value);
        Collections.sort(list);
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
