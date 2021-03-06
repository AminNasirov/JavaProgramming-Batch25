package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz",29, 'M',1,"Java developer",150000);

        Tester tester =  new Tester("Olga",27,'F',2,"SDET",110000);

        Teacher teacher = new Teacher("Daniel",32,'M',3,"Math Teacher",110000);

        Student student = new Student("Suhaib",32,'M',5,"Cydeo");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("---------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("---------------------------------------");

        developer.work();
        teacher.work();
        tester.work();
        //student.work();

        System.out.println("---------------------------------------");
        
        developer.eat();
        developer.drink();
        developer.sleep();
        
        developer.fixingBugs();

        System.out.println("---------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        
        tester.createTicket();

        System.out.println("---------------------------------------");


        teacher.eat();
        teacher.drink();
        teacher.sleep();
        System.out.println("---------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();







    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */
