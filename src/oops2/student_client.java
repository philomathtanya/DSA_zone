package oops2;


public class student_client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//
//		Student s = new Student();
//		System.out.println(s.age);
//		System.out.println(s.name);
//		s.age = 90;
//		s.name = "Ramu";
//		System.out.println(s.age);
//		System.out.println(s.name);
//		Student s1 = new Student();
//		s1.age = 25;
//		s1.name = "Vaibhavi";
//		System.out.println(s1.age);
//		System.out.println(s1.name);
//
//
//		s.Intro_yourSelf();

        student s2 = new student();
        student s3 = new student();
        s2.name = "kunal";
        s2.age = 28;
        s3.name = "Hardik";
        s3.age = 26;
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
        System.out.println(".....................");
        // Test1(s2, s3);
        // Test2(s2, s3);
        int my_age = 20;
        String my_name = "C";
        Test3(s2, s3.age, s3.name, my_age, my_name);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);

    }

    public static void Test3(student s, int age, String name, int myAge, String myName) {
        s.age = 0;
        s.name = "_";
        age = 0;
        name = "_";
        myAge = 0;
        myName = "_";
    }

    public static void Test2(student s2, student s3) {

        s2 = new student();
        int tempa = s2.age;
        s2.age = s3.age;
        s3.age = tempa;
        s3 = new student();
        String tempn = s2.name;
        s2.name = s3.name;
        s3.name = tempn;
    }

    public static void Test1(student s2, student s3) {
        student t = s2;
        s2 = s3;
        s3 = t;

    }

}