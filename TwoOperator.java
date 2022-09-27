import org.w3c.dom.ls.LSOutput;

public class TwoOperator {
    public void twoOperator(int[] arr, int target) {
        int sum = 0;
        sum = arr[0] + arr[1] + arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] - arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " - " + arr[2] + " + " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] - arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " - " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] + arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " + " + arr[2] + " + " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] + arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " + " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] - arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2] + " + " + arr[3]);
    }

    public void twoOperator1(int[] arr, int target) {
        int sum = 0;
        sum = arr[0] + arr[1] + arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] * arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " * " + arr[2] + " + " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] * arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " * " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] * arr[1] + arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " + " + arr[2] + " + " + arr[3]);
        sum = 0;
        sum = arr[0] * arr[1] + arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " + " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] * arr[1] * arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " * " + arr[2] + " + " + arr[3]);
    }
    public void twoOperator2(int[] arr, int target) {
        int sum = 0;
        sum = arr[0] + arr[1] + arr[2] / arr[3] ;
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] / arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " / " + arr[2] + " + " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] / arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " / " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] + arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " + " + arr[2] + " + " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] + arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " + " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] / arr[2] + arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " / " + arr[2] + " + " + arr[3]);
    }
    public void twoOperator3(int[] arr, int target) {
        int sum = 0;
        sum = arr[0] * arr[1] * arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " * " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] * arr[1] - arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " - " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] - arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " - " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] * arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " * " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] * arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " * " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] - arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2] + " * " + arr[3]);
    }
    public void twoOperator4(int[] arr, int target) {
        int sum = 0;
        sum = arr[0] / arr[1] / arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " / " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] - arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " - " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] - arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " - " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] / arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " / " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] / arr[2] - arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " / " + arr[2] + " - " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] - arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2] + " / " + arr[3]);
    }
    public void twoOperator5(int[] arr, int target) {
        int sum = 0;
        sum = arr[0] * arr[1] * arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " * " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] * arr[1] / arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " / " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] / arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " * " + arr[1] + " / " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] * arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " * " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] * arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " * " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] / arr[1] / arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " / " + arr[1] + " / " + arr[2] + " * " + arr[3]);
    }
}
