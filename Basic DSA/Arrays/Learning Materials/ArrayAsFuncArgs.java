public class ArrayAsFuncArgs {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        update(marks); // * calling a static method without class object or class name...

        for (int i = 0; i < marks.length; i++) {
            System.out.println("at index " + i + ": " + marks[i]);
        }
    }
}
