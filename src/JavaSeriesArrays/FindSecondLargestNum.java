package JavaSeriesArrays;
import java.util.*;
public class FindSecondLargestNum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter arrays size=");
        int size=sc.nextInt();
        System.out.print("enter number");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int secondlargest=arr[0];
        int largest=arr[0];
for(int i=1;i<arr.length;i++) {
    if (arr[i] > largest) {
        secondlargest = largest;
        largest = arr[i];
    } else if (arr[i] > secondlargest && arr[i] != largest) {
        secondlargest = arr[i];
    }
     sc.close();
}
        System.out.println("Largest Number is ="+largest);
        System.out.println("Second Largest Number is ="+secondlargest);
    }
}