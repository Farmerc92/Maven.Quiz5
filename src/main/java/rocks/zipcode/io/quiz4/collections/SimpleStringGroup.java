package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {

    ArrayList<String> list;
    public SimpleStringGroup() {
        list = new ArrayList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(String string) {
        list.add(string);
    }

    public Boolean has(String string) {
        return list.contains(string);
    }

    public String fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(String string) {
        list.remove(string);
    }

    public void clear() {
        list.clear();
    }
    @Override
    public Iterator<String> iterator(){
        return list.iterator();
    }
}
