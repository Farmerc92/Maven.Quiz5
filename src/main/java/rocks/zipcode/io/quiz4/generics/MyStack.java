package rocks.zipcode.io.quiz4.generics;

import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    private Deque<SomeType> deque;
    public MyStack() {
        deque = new LinkedList<>();
    }

    public Boolean isEmpty() {
        return deque.isEmpty();
    }

    public void push(SomeType i) {
        deque.push(i);
    }

    public SomeType peek() {
        return deque.peek();
    }

    public SomeType pop() {
        if (deque.size() == 0){
            throw new EmptyStackException();
        }
        return deque.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return deque.iterator();
    }
}
