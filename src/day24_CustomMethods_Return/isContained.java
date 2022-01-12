package day24_CustomMethods_Return;

public class isContained {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = 10;

        boolean result1 = isContained(arr, num);

        System.out.println(result1);

    }

    public static boolean isContained(int[] array, int num) {

        boolean result = false;

        int count = 0;

        for (int each : array) {
            if (each == num) {
                count++;
            }
        }
        if (count >= 1) {
            result = true;
        } else {
            result = false;
        }


        return result;

    }
}
/*
Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */
