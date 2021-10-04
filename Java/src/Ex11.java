import java.util.Arrays;

public class Ex11 {
    static int evenLevel(int num) {
        int even = 0, odd = 0;
        int units;
        while (num > 0) {
            units = num % 10;
            if (units % 2 == 0) {
                even += units;
            } else {
                odd += units;
            }
            num /= 10;
        }
        return even - odd;
    }

    /**
     * 
     * @param int[] arr1
     * @param int[] arr2
     * @return true is arr1 is sub array of arr2 by even level numbers, else false.
     */
    static boolean subArrayByEvenLevel(int[] arr1, int[] arr2) {
        int[] arr1EvenLevels = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1EvenLevels[i] = evenLevel(arr1[i]);
        }

        boolean found;
        int temp;
        for (int num : arr2) {
            found = false;
            temp = evenLevel(num);
            for (int j : arr1EvenLevels) {
                if (temp == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    static void copySubArrayToArray(int[] arr1, int limit, int[] result, int whereToBegin) {
        for (int i = 0; i < limit; i++) {
            result[whereToBegin] = arr1[i];
            result[whereToBegin + 1] = evenLevel(arr1[i]);
            whereToBegin += 2;
        }
    }

    static int[] newArrayWithLevels(int[] arr) {
        int[] negLevels = new int[arr.length];
        int[] zeroLevels = new int[arr.length];
        int[] posLevels = new int[arr.length];
        int negIndex = 0, zeroIndex = 0, posIndex = 0;
        int temp;
        for (int i : arr) {
            temp = evenLevel(i);
            if (temp > 0) {
                posLevels[posIndex] = i;
                posIndex++;

            } else if (temp == 0) {
                zeroLevels[zeroIndex] = i;
                zeroIndex++;
            } else {
                negLevels[negIndex] = i;
                negIndex++;
            }
        }
        int resultIndex = 0;
        int[] result = new int[arr.length * 2];

        copySubArrayToArray(negLevels, negIndex, result, resultIndex);
        resultIndex += (negIndex * 2);
        copySubArrayToArray(zeroLevels, zeroIndex, result, resultIndex);
        resultIndex += (zeroIndex * 2);
        copySubArrayToArray(posLevels, posIndex, result, resultIndex);
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(evenLevel(543));
        // System.out.println(evenLevel(4637));
        // System.out.println(evenLevel(83));
        int[] arr = { 6, 74, 5852, 221, 457 };
        System.out.println(Arrays.toString(newArrayWithLevels(arr)));

    }
}
