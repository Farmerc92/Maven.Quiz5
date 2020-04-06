package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet<_> implements Comparable<ComparableTreeSet<_>>{
    private TreeSet<_> treeSet;

    public ComparableTreeSet(_... arr) {
        treeSet = new TreeSet<>(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
        treeSet = new TreeSet<>();
    }



    @Override
    public int compareTo(ComparableTreeSet<_> o) {
        return Integer.valueOf(null);
    }

    @Override
    public String toString(){
        return "";
    }
}
