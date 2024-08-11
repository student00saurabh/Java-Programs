package Questions;

public class Question24 {
    public static void main(String[] args) {
        Student s1=  new Student();
        s1.name="Saurabh";
        s1.roll=30;
        s1.marks[0] = 4;
        s1.marks[1] = 3;
        s1.marks[2] = 2;
        // System.out.println(s1.name);
        // Student s3=  new Student(5);

        // System.out.println(s3.roll);
        Student s2 = new Student(s1);
       // System.out.println(s2.name);
        s1.marks[1] = 1;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        } 
       
    }
}
class Student{
    String name;
    int roll;
    int marks[];
    // Student(String name){
    //     this.name=name;
    // }
    // Student(int roll){
    //     this.roll = roll;
    // }
    //copy constructur
    Student(Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
           this.marks[i]=s1.marks[i];
        } 

    }
   Student(){
    System.out.println();
    marks= new int[3];
   }
}