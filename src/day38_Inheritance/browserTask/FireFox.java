package day38_Inheritance.browserTask;

public class FireFox extends Browser {

    public FireFox() {
        super("FireFox");
    }

    public void openBrowser() {
        System.out.println("opening "+name+" browser");
    }

    public void closeBrowser() {
        System.out.println("closing "+name+" browser");
    }
}
/*
2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"
 */