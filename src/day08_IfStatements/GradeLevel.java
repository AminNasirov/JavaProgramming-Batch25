package day08_IfStatements;

/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */
public class GradeLevel {
    public static void main(String[] args) {

        byte number = 18;
        boolean isElementarySchool = number>=1 && number<=5;
       // boolean isElementarySchool = number==1 ||number==2 || number==3 || number==4 || number==5;
        boolean isMiddleSchool =  number>=6 && number<=8;
        //boolean isMiddleSchool = number==6 || number==7 || number==8;
        boolean isHighSchool = number>=9 && number<=12;
        //boolean isHighSchool = number==9 || number==10 || number==11 || number==12;
        boolean isCollege = number>=13 && number<=16;
        //boolean isCollege = number==13 || number==14 || number==15 || number==16;
        //boolean isGradSchool = number>=17 && number<=18;
        boolean isGradSchool = number==17 || number==18;


        if(isElementarySchool){
            System.out.println("Elementary School");
        }
        else if(isMiddleSchool){
            System.out.println("Middle School");
        }
        else if(isHighSchool){
            System.out.println("High School");
        }
        else if(isCollege){
            System.out.println("College");
        }
        else{
            System.out.println("Grad School");
        }


    }
}
