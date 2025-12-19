code
import java.util.Scanner;

class ArrayDemo {
    public static void main(String[] args) {

        // 1. Static 
        int[] numbers = {10, 20, 30, 40};
        String[] names = {"Puneeth", "Charan", "dhanu"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        float[] marks = new float[] {75.5f,80.7f,78.2f};
    

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Dynamic 
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];   
        
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        
        String[] users;
        users = new String[3];

        users[0] = "A";
        users[1] = "B";
        users[2] = "C";

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
    }
