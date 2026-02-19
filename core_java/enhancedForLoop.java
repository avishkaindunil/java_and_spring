class Student{
    int rollno;
    String name;
    int marks;
}

public class enhancedForLoop{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Shah Rukh";
        s1.marks = 99;

        Student s2 = new Student();
        s2.name = "Hrithik";
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "Salman";
        s3.marks = 91;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student stud : students){
            System.out.println(stud.name + ": " + stud.marks);
        }

    }
}