package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent2 {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName, programmingLanguage, secretCode;
    public String fieldOfStudy;

    public CydeoStudent2(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void programingLanguage(){
        System.out.println(programmingLanguage);
    }

    public static void  printSecretCode(){
        System.out.println(secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name+" is studying in Cydeo "+ batchNumber);
    }

    public String toString() {
        return "CydeoStudent2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", School Name=" + schoolName +
                ", field of Study=" + fieldOfStudy +
                ", programming language=" + programmingLanguage +
                ", secret code =" + secretCode +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
