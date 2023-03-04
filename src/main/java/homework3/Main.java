package homework3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("111");
        linkedList.add("222");
        linkedList.add(1,"333");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        linkedList.remove(1);

        Iterator<String> iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            String element = iterator1.next();
            System.out.println(element);
        }
        System.out.println();

        String n = linkedList.get(0).toString();
        System.out.println(n);
    }
}

