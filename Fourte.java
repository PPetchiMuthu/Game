import java.util.Scanner;

public class Fourte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Target : ");
        int target = scan.nextInt();
        System.out.print("Enter Four Numbers : ");
        int[] array = new int[4];
        for(int i=0;i<4;i++)
            array[i]= scan.nextInt();
        int i=0;
        while(i<4) {
            oneOperator(array, target);
            TwoOperator two = new TwoOperator();
            two.twoOperator(array, target);
            two.twoOperator1(array, target);
            two.twoOperator2(array, target);
            two.twoOperator3(array, target);
            two.twoOperator4(array, target);
            two.twoOperator5(array, target);
            ThreeOperator three = new ThreeOperator();
            three.threeOperator(array, target);
            rotate(array);
            i++;
        }
    }

    public static void rotate(int[] array){
        int temp = array[0];
        for(int i=0;i<3;i++)
            array[i] =array[i+1];
        array[3]= temp;
    }
    public static void oneOperator(int[] array, int target){
        int sum =0;
        for(int i:array)
            sum+=i;
        if(sum==target)
            System.out.println(array[0]+"+"+array[1]+"+"+array[2]+"+"+array[3]);
        sum =0;
        for(int i:array)
            sum-=i;
        if(sum==target)
            System.out.println(array[0]+"-"+array[1]+"-"+array[2]+"-"+array[3]);
        sum =1;
        for(int i:array)
            sum*=i;
        if(sum==target)
            System.out.println(array[0]+"*"+array[1]+"*"+array[2]+"*"+array[3]);
        sum =1;
        for(int i:array)
            sum/=i;
        if(sum==target&&sum==Math.abs(sum))
            System.out.println(array[0]+"/"+array[1]+"/"+array[2]+"/"+array[3]);
    }

}
