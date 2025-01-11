import java.util.ArrayList;
import java.util.Arrays;

public class Learning1 {
    // here we are going to learn about different operations and methods on
    // arraylists....

    // ? 1) add(E element)
    // * adds element at the end of the list..

    // ? 2) add(int ind, E element)
    // * adds element at a specific position in the list..

    // ? 3) get(int ind)
    // * returns the element present on the specific index in the list..

    // ? 4) set(int ind, E element)
    // * replace the given element with the value presents on the specific index..

    // ? 5) remove(int ind)
    // * removes the element from the specific elements and rearranges the list..

    // ? 6) remove(Object o)
    // * removes the first occurence of the specific element of the list..

    // ? 7) size()
    // * returns the total no. of elements present in the list..

    // ? 8) isEmpty()
    // * returns true if the list is empty, else false..

    // ? 9) clear()
    // * clears the entire list, means removes all the elements from the list..

    // ? 10) contains(Object o)
    // * returns true if the specific element is presents in the list..

    // ? 11) indexOf(Object o)
    // * returns the index of the element's first occurence in the list..

    // ? 12) lastIndexOf(Object o)
    // * same as the indexOf() but returns the index of last occurence..

    // ? 13) toArray()
    // * used with the list and returns the array of elements of the list..

    // ? 14) subList(int stInd, int endInd)
    // * returns the sub-list of the current one

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Guava");
        list.add("Walnut");
        list.add("Cherry");
        list.add("Watermelon");
        list.add("Apple");

        System.out.println(list);

        // adding mango at the 3rd index..

        list.add(3, "Mango");

        System.out.println(list);

        // accessing 6th element..
        System.out.println(list.get(6));

        // setting the value of 6th element by a veggie's name..
        list.set(6, "Tomatoes");
        System.out.println(list);

        // removing a dry-fruit from the 5th index..
        // list.remove(5);
        // you can do it by providing element also...
        list.remove("Walnut");
        System.out.println(list);

        // let's check the total no. of elements in the list..
        System.out.println("Total no. of elements: " + list.size());

        // let's check whether the list is empty or not!..
        System.out.println("Is the list empty? - " + ((list.isEmpty() == false) ? "No" : "Yes"));

        // let's check whether "Tomatoes" are available in our list or not!
        System.out.println("Are tomatoes in our cart? - " + ((list.contains("Tomatoes") == false) ? "No" : "Yes"));

        // let's check the first occurrence of "Apple"
        System.out.println("\"Apple\" first found at index: " + list.indexOf("Apple"));

        // let's check the last occurrence of "Apple"
        System.out.println("The last \"Apple\" found at index: " + list.lastIndexOf("Apple"));

        // let's get a subList of our list , last index is a non-inclusive..
        System.out.println(list.subList(0, 5));

        // let's create an array from the subList of a list..
        Object arr[] = list.subList(0, 5).toArray();
        System.out.println(Arrays.toString(arr));

        // let's clear our list now!..
        list.clear();
        System.out.println(list);
    }
}
