package oops;
class Student
{
    String name;
    static String school;

    public static void changeSchool(){
        school = "SVPS";
        System.out.println(school);
    }
}

public class Static 
{
    public static void main(String[] args) 
    {
        Student.school = "JVM";
        // System.out.println(Student.school);  
        Student s1 = new Student();
        Student.changeSchool();
    }   
}


// class Student
// {
//     String name;
//     String school;
// }

// public class Static 
// {
//     public static void main(String[] args) 
//     {
//         Student s1 = new Student();
//         s1.school = "SVPS";
//         System.out.println(s1.school);    
//     }   
// }
