import java.util.*;
public class stock{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of days:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(i+1)+" day price:");
            a[i]=sc.nextInt();
        }
        System.out.println("Prices Stored in the array are:");
        System.out.println(Arrays.toString(a));
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
 
        for (int price : a) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
 
        System.out.println("Maximum profiit is:"+maxProfit);
    }
}
