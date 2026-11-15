package pr_21.z1;

import java.util.ArrayList;

public class ArrayToList {

    public static <T> ArrayList<T> convert(T[] array) {

        ArrayList<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }
}