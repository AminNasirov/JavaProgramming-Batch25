package day20_Arrays;

public class ItemPriceItemIDc {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        int number = 0;
        String result = "";
        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            if (itemName.equals("Gloves")) {
                number=i;
            }
            if("iPad".contains(itemName)){
                result="Ipad";
            }

            System.out.println(items[i]+ " - $"+prices[i]+" - item ID: "+itemIDs[i]);
        }



        System.out.println("index number = "+number);
        System.out.println("find out item: "+ result);




    }
}

/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */