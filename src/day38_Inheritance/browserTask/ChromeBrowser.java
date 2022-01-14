package day38_Inheritance.browserTask;

public class ChromeBrowser extends Browser {

    public ChromeBrowser() {
        super("Chrome");
    }

    public void openBrowser() {
        System.out.println("opening "+name+" browser");
    }

    public void closeBrowser() {
        System.out.println("closing "+name+" browser");
    }
}
/*
2. Create the following sub classes of Browser and override the methods if needed:

			1. ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"
 */
