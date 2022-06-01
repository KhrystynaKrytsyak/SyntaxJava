import java.util.Scanner; 
class Main {
 public static void main(String [] args){
   
   Scanner input=new Scanner (System.in);
   System.out.println("Do you need a loan?");
  boolean loan=input.nextBoolean(); 
   loan=true;
   if (loan) {
   System.out.println("What is your credit score?");
   int creditScore=input.nextInt();
   if (creditScore<600) {
     System.out.println("Not eligible");
   }else if (creditScore>=600 && creditScore<=700){
System.out.println("Maybe eligible");
     
   }else if(creditScore>=701 && creditScore<=800){
     System.out.println("Eligible");
   }else if (creditScore>800) {
     System.out.println("Definitely eligible");
   }else {
     System.out.println("Not eligible");
   }     
   }
}
}
