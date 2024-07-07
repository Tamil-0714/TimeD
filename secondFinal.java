// 1. AIm: To write a java program to perform simple classes and objects concepts by implementing Student class;

import java.util.Scanner;

class Student {
    private int age, avg;
    private String name, contact;

    public Student(String name, int age, int avg, String contact) {
        this.name = name;
        this.age = age;
        this.avg = avg;
        this.contact = contact;

    }

    public Student() {
        this.name = null;
        this.age = 0;
        this.avg = 0;
        this.contact = null;
    }

    public void viewStudentData() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Age : " + this.age);
        System.out.println("Student Average Mark : " + this.avg);
        System.out.println("Student Contact : " + this.contact);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = scan.nextLine();
        System.out.print("Enter Student Age : ");
        int age = scan.nextInt();
        System.out.print("Enter Student Average Mark : ");
        int avg = scan.nextInt();
        System.out.print("Enter Student Contact : ");
        scan.nextLine();
        String contact = scan.nextLine();
        Student std1 = new Student(name, age, avg, contact);
        System.out.println("--------------------------------");
        std1.viewStudentData();
        scan.close();
    }
}
/*
 Output;
    Enter Student Name : Tamil
    Enter Student Age : 21
    Enter Student Average Mark : 77
    Enter Student Contact : 9943112938
    --------------------------------
    Student Name : Tamil
    Student Age : 21
    Student Average Mark : 77
    Student Contact : 9943112938


 */


 //2. Aim: To write a Java program to perform conditional statements (if, if-else, nested if-else, and if-elif-else) 
//      for a grading system


import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scan.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                if (score >= 50) {
                    System.out.println("Grade: E");
                } else {
                    System.out.println("Grade: F");
                }
            }
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }


        scan.close();
    }
}


/*
output:
    Enter the student's score: 77
    Grade: C
 */




 // 3. Aim : To write a Java program to find fibonacci sequence of n numver using looping statement;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENter the limit : ");
        int limit = scan.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < limit; i++) {
            c = a+b;
            
            System.out.print(c+ " ");
            a = b;
            b = c;
        }
    }   
}


/*
output:
    ENter the limit : 7
    0 1 1 2 3 5 8
 */



 // 4. Aim : To write a Java program to find given number in prime or not using looping statement;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENter the Number : ");
        int n = scan.nextInt();
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) factors++;
        }
        if(factors == 2) System.out.println("Prime Number");
        else System.out.println("Not prime number");
    }
}

/*
Output:
    ENter the Number : 13
    Prime Number

    ENter the Number : 9
    Not Prime Number

 */
