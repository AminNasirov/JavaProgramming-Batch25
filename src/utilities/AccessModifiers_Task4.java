package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Task4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

       // System.out.println(AccessModifiers_Task4.name1); default is not visible outside  the package
        System.out.println(AccessModifiers_Task4.name2);  // protected is  visible outside  the package

        AccessModifiers_Task4.method2();
       // AccessModifiers_Task4.method1();

    }

}
