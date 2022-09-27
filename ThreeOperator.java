public class ThreeOperator {
    public void threeOperator(int[] arr,int target){
        int sum = 0;
        sum = arr[0] + arr[1] - arr[2] * arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " - " + arr[2] + " * " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] - arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " - " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] + arr[1] * arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " + " + arr[1] + " * " + arr[2] + " / " + arr[3]);
        sum = 0;
        sum = arr[0] - arr[1] * arr[2] / arr[3];
        if (sum == target) System.out.println(arr[0] + " - " + arr[1] + " * " + arr[2] + " / " + arr[3]);
    }
}
