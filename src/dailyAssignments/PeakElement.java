package dailyAssignments;

public class PeakElement {
    public PeakElement() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 20, 15};

        for(int i = 0; i < arr.length; ++i) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println(arr[i] + " is a peak element at " + i + " index");
                }
            } else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println(arr[i] + " is a peak element at " + i + " index");
                }
            } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i] + " is a peak element at " + i + " index");
            }
        }

    }
}