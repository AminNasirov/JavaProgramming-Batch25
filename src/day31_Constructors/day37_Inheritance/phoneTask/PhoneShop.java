package day31_Constructors.day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12" , "ProMax", 1000, "White");
        Samsung samsung = new Samsung("Galaxy Z Fold3", "7.6 inches", 1799, "Phantom Silver");
        Nokia nokia = new Nokia("6700","2.2 inches",99,"Silver");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.faceTime(706402155);
        iphone.faceTime("yahoo@gmail.com");

        samsung.freeze();

        nokia.selfDefense();

        System.out.println("----------------------------");

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);



    }
}
