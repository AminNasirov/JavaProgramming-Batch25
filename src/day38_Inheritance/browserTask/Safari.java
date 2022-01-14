package day38_Inheritance.browserTask;

public class Safari extends Browser {

    public Safari() {
        super("Safari");
    }


    public void openBrowser() {
        System.out.println("opening "+name+" browser");
    }

    public void closeBrowser() {
        System.out.println("closing "+name+" browser");
    }
}
/*
4. Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"
 */
