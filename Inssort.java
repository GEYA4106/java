import java.util.Scanner;
class Inssort{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while((temp<arr[j])&&(j>=0)){
                arr[j+1]=arr[j];
                j=j-1
            }
            arr[j+1]=temp;
        }
        System.out.println("sorted elements are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}