

// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student1 student1 = new Student1("Mary");
        Student1 student2 = new Student1("Mike");
        student1.inputGrades();
        student1.getAverage();
        System.out.println();
        //input grades for Mike
        //print average for Mike
    }
}