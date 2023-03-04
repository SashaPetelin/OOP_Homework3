package homework3;

import java.util.Iterator;

public class LinkedList implements Iterable{

    private Type prime;
    private Type end;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Type elementThis = new Type("0");
            {
                elementThis.setNextType(prime);
            }
            Type currentElement = elementThis;

            @Override
            public boolean hasNext() {
                return currentElement.getNextType() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNextType();
                return currentElement.getObject();
            }
        };
    }

    public int size() {
        return count;
    }

    private Type getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }

        Type result = prime;
        for (int i = 1; i <= index; i++){
            result = result.getNextType();
        }
        return result;
    }

    public Object get(int index){

        Type element = getElement(index);

        return element.getObject();
    }


    public void remove(int index){

        Type currentElement = getElement(index);
        Type nextElement = currentElement.getNextType();
        Type previousElement = currentElement.getPrevType();

        if (index == 0){
            prime = nextElement;
            if (end == currentElement){
                end = null;
            }
        }

        if (index == count - 1){
            end = previousElement;
            if (prime == currentElement){
                prime = null;
            }
        }
        count--;

        if (nextElement != null){
            nextElement.setPrevType(previousElement);
        }

        if (previousElement != null){
            previousElement.setNextType(nextElement);
        }
    }

    public void add(int index, Object data){
        if (count == index){
            add(data);
            return;
        }
        count++;

        Type currentElement = new Type(data);

        if (index == 0){
            prime = currentElement;
        }

        Type nextElement = getElement(index);
        Type previousElement = nextElement.getPrevType();

        currentElement.setNextType(nextElement);
        currentElement.setPrevType(previousElement);

        if (previousElement != null) {
            previousElement.setNextType(currentElement);
        }

    }

    public void add(Object data){
        count++;
        Type element = new Type(data);
        if (prime == null){
            prime = element;
            end = element;
            return;
        } else if (end == null) {
            end = element;
            return;
        }

        end.setNextType(element);
        element.setPrevType(end);
        end = element;
    }

}
