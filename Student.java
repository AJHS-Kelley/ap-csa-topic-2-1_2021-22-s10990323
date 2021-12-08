// Lorenzo Kenon 12/6/21 8:34AM v2.0
import java.util.Scanner;

public class Student  {
    // These are INSTANCE VARIABLES 
     private int studentID;
     private int gradeLevel;
     private double gradePointAvg;
     private String studentName;


     // Creating a Constructor 
     public Student() {
         this.studentID = 0;
         this.gradeLevel = 0;
         this.gradePointAvg = 0.0;
         this.studentName = "";
     }

     // Value constructer 
     public Student( int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = GPA;
        this.studentName = studentName;
     }
     public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = 9;
        this.gradePointAvg = 4.0;
        this.studentName = studentName;
    }


 public static void calGPA() {
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your first grade");
        grade0 = myScanner.nextInt();
        System.out.println("What is your second grade");
        grade1 = myScanner.nextInt();
        System.out.println("What is your third grade");
        grade2 = myScanner.nextInt();
        System.out.println("What is your fourth grade");
        grade3 = myScanner.nextInt();

        newGPA = (grade0 +grade2 + grade3 + grade1) / 4;
        System.out.print("The new GPA");
        System.out.println(newGPA);
 }


public static void assignLunch(int gradeLevel) {
     String lunchPeriod;

    if (gradeLevel == 9){
        lunchPeriod = "First Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 10){
        lunchPeriod = "First Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 11){
        lunchPeriod = "First Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    } else {
        lunchPeriod = "First Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    }
    }

public static void assignLunch(int gradeLevel, double gradePointAvg) {
    String lunchPeriod;
// AND, OR, NOT -- Boolean Operators
// && -- AND
// || -- 0R
// ! -- NOT 
    if (gradeLevel == 9 || gradePointAvg <= 1.5){
        lunchPeriod = "First Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 10 && gradePointAvg > 2.0){
        lunchPeriod = "Second Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    } else if (gradeLevel == 11 && (gradePointAvg != 0.0)){
        lunchPeriod = "Third Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    } else  {
        lunchPeriod = "Off-Campus Lunch";
        System.out.print("This Student has ");
        System.out.println(lunchPeriod);
    }
}

public static void mathPractice (){
    double x;
    double y;
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Type in your number.\n");
    x = myscanner.nextDouble();
    y = myscanner.nextDouble();
    System.out.println(Math.min(x , y));

    double lowest;
    lowest = Math.min(x , y);
    System.out.println(lowest);

    System.out.println("Next we will use Math.pow() to calculate\n");
    System.out.println(Math.pow(x , y));

    double exponents; 
    exponents = Math.pow(x , y);
    System.out.println(exponents);
    System.out.println("Printing random numbers.\n");
    System.out.println(Math.random());

    double percentage;
    percentage = (Math.random() * 100);
    System.out.print("There is a ");
    System.out.print(percentage);
    System.out.println("Chance of rain today.\n");

    int round;
    round = (int) Math.round(x);
    System.out.println(round);

    
}

public static double getGPA() {
    int grade0, grade1, grade2;

    grade0 = 87;
    grade1 = 92;
    grade2 = 79;

    double fakeGPA;
    fakeGPA = (grade0, grade1, grade2) / 3;

    return fakeGPA;

}

public static void main(String[] args){

    //mathPractice();

    double realGPA;
    realGPA = -1.0;
    System.out.println(realGPA);
    realGPA = getGPA();
    System.out.println(realGPA);
}







    }
