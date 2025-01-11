import java.util.Scanner;

// array of objects...

class Student {
    public int rollNo;
    public String name;

    Student(int rn, String nm) {
        this.rollNo = rn;
        this.name = nm;
    }
}

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stdArr = new Student[5];
        int rn;
        String nm;

        for (int i = 0; i < stdArr.length; i++) {
            System.out.print("enter your roll no: ");
            rn = sc.nextInt();
            System.out.print("enter your name: ");
            nm = sc.next();
            stdArr[i] = new Student(rn, nm);
        }

        for (int i = 0; i < stdArr.length; i++) {
            System.out.println("Element at " + i + " : " + stdArr[i].rollNo + " " + stdArr[i].name);
        }

        sc.close();
    }
}
