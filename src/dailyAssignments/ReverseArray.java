package dailyAssignments;

public class ReverseArray {
    public ReverseArray() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] reverseArr = new int[arr.length];
        System.out.println("Original array");

        int i;
        for(i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

        for(i = 0; i < arr.length; ++i) {
            reverseArr[i] = arr[arr.length - i - 1];
        }

        System.out.println("Reversed array");

        for(i = 0; i < arr.length; ++i) {
            System.out.println(reverseArr[i]);
        }

    }
}
