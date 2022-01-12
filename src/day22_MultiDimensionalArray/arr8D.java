package day22_MultiDimensionalArray;

public class arr8D {
    public static void main(String[] args) {

        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };

        for (int[][][][][][][] each7 : arr8D) {
            for (int[][][][][][] each6 : each7) {
                for (int[][][][][] each5 : each6) {
                    for (int[][][][] each4 : each5) {
                        for (int[][][] each3 : each4) {
                            for (int[][] each2 : each3) {
                                for (int[] each1 : each2) {
                                    for (int each : each1) {
                                        System.out.print(each+" ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/*
Given the array:
            int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };


        Use for each loop to print each elements
 */