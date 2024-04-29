class DemoException
{
   public static void main(String[] args){
     int i,j,k=0;
     i = 34;
     j = 0;
     try{
     k = i/j;
     }
     catch(Exception err1)
     {
     System.out.println(err1);
     System.out.println("Exception Catched !!!");
     }
     
     System.out.println(k);
     }
     }
