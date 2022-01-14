package day38_Inheritance.browserTask;

public class Browser {

    public String name;

    public Browser(String name) {
        this.name = name;
    }

    public void openBrowser(){
        System.out.println("opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("closing chrome browser");
    }


}
/*
Browser Task:
	1. Create a class named Browser:

			Methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"
 */
