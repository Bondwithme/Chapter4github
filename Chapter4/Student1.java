// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student1
{
    //declare instance data
    private String name;
    private double test1;
    private double test2;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student1(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    Scanner scan = new Scanner(System.in);
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Enter" + name + "score for test1");
        test1 = scan.nextDouble();
        System.out.println("Enter Joe's score for test 2");
        test2 = scan.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public String getAverage()
    {
        //add body of getAverage
        return name+"'s average is: " + ((test1 + test2)*0.5);
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public String getName()
    {
        //add body of getName
        return "The student's name is: " + this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    public void printName()
    {
        //add body of printName
        System.out.println("The student's name is: " + name);
    }
}
