package day38_Inheritance.browserTask;

public class Opera extends Browser{

    public Opera() {
        super("Opera");
    }

    public void openBrowser() {
        System.out.println("opening "+name+" browser");
    }

    public void closeBrowser() {
        System.out.println("closing "+name+" browser");
    }


}
/*
3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"
 */
