import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            sum += scanner.nextInt();

        }
        System.out.print(sum / 5);
    }

}

//----------------------------------------------------------------------------

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENter the Number : ");
        int n = scanner.nextInt();
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) factors++;
        }
        if(factors == 2) System.out.println("Prime Number");
        else System.out.println("Not prime number");
    }
}

//----------------------------------------------------------------------------

import java.util.Scanner;

public class FarenheatToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Farenheat: ");
        double farenheat = scanner.nextDouble();

        double celsius = (farenheat - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius);

    }
}

//----------------------------------------------------------------------------

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENter the Number : ");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of Number : "+fact);
    }
}

//----------------------------------------------------------------------------

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and height : ");
        double l = scanner.nextInt(), b = scanner.nextDouble();
        System.err.println("Area of triange is : " + 0.5 * l * b);
    }
}

//----------------------------------------------------------------------------

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENter the limit : ");
        int limit = scanner.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < limit; i++) {
            c = a+b;
            
            System.out.print(c+ " ");
            a = b;
            b = c;
        }
    }   
}

//----------------------------------------------------------------------------

class Student {
    private int age, avg;
    private String name;

    public Student(String name, int age, int avg) {
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    public Student() {
        this.name = null;
        this.age = 0;
        this.avg = 0;
    }

    public void setStudentData(String name, int age, int avg) {
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    public void viewStudentData() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Age : " + this.age);
        System.out.println("Student Average Name : " + this.avg);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student std1 = new Student("tamil", 20, 79);
        std1.viewStudentData();
        System.out.println("\nAfter updated\n");
        std1.setStudentData("Tamilarasan N", 19, 77);
        std1.viewStudentData();
    }
}

//----------------------------------------------------------------------------
