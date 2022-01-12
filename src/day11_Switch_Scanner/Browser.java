package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "edge";

        boolean validBrowser=browserName=="chrome"||browserName=="firefox"
                ||browserName=="opera"||browserName=="safari"||browserName=="edge";

        String result = (validBrowser)? (browserName=="chrome")?"chrome Browser is selected":(browserName=="opera")?
                "opera Browser is selected" :(browserName=="firefox")?"firefox Browser is selected"
                :(browserName=="safari")?"safari Browser is selected" :"edge Browser is selected"
                :"Invalid Browser Name";

        System.out.println(result);



    }
}
/*
1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */