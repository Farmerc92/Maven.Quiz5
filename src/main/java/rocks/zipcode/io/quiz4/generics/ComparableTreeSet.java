package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T extends Comparable<T>> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>>{
    private TreeSet<T> set = new TreeSet<>();

    public ComparableTreeSet(T... arr) {
        set.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
    }

    public TreeSet<T> getTreeSet() {
        return set;
    }

    @Override
    public int compareTo(ComparableTreeSet<T> o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public String toString(){
        return set + "";
    }
}
