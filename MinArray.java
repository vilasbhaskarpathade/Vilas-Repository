public class MinArray
{
    public static void main(String []args)
    {
        int arr[]={23,45,67,8,3};
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("smallest number : "+ min);
    }

}
