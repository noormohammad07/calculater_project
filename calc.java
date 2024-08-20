package calculater;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       do{
        calc obj=new calc();
        
        System.out.println("--------Welcome to our calculater------");
  
        slectopration();
        boolean flag=exitprogram();
        if(flag==false){
            System.out.println("Thanks for using my calculater");
            break;
        }

       }while(true);
     
    }

    public static boolean exitprogram(){
        Scanner sc=new Scanner(System.in);
        int time=0;
        int retry=5;
        boolean flag=true;

        for(time=0;time<retry;time++){
           System.out.println("DO YOU WANT TO continew(Y/N & y/n)");
            String s=sc.nextLine();
           char c=s.charAt(0);
           if(c=='y'){
            slectopration();
           }else if(c=='n'){
            flag=false; 
           }else{
            System.out.println("enter the valid input");
           }
        }

        if(time>=retry){
            flag=false;
        }
        
 
        return flag;
    }

    public static void slectopration(){
        Scanner sc=new Scanner(System.in);
        System.out.println("what dou you want :=");
        String s=sc.nextLine();
        char c=s.charAt(0);

        switch (c) {
            case '+':
                int a=getinteger();
                int b=getinteger();
                System.out.println("addition :="+(a+b));
                break;

            case '-':
                int f=getinteger();
                int g=getinteger();
                System.out.println("Substraction :="+(f-g));
                break;    
            case '*':
                int e=getinteger();
                int d=getinteger();
                System.out.println("Multiplication :="+(e*d));
                break;  
                
            case '/':
                int x=getinteger();
                int y=getinteger();
                System.out.println("Division :="+(x/y));
                break; 
                
            case '%':
                int u=getinteger();
                int t=getinteger();
                System.out.println("modulus :="+(u%t));
                break;    
            default:
                break;
        }
  
    }

    public static int getinteger(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value num1");
        int num1=sc.nextInt();
        return num1;
    }
}
