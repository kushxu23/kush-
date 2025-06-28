 import java.util.*;
  public class ko  {
  
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in) ;
        int A = sc.nextInt() ;
        if(A>0) {
            System.out.println("postive number ") ;
        }
        else{
            System.out.println("negtive number ") ;
        }*/ 
//QUESTION 2
        
     /*x  Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble() ;

        if (temp>100) {
            System.out.println("HIGH FEVEER") ;

        }
        else {
            System.out.println("NO fever") ;

        } */

  //qUESTION 3 PROGRAM to input week number and print the day of week name using swtich case 
        Scanner sc = new Scanner(System.in );
        int WEEK = sc.nextInt();
        switch(WEEK) {
            case 1 :
            System.out.println("MONDAY") ;
             break ;
            case 2 :
             System.out.println("TUESDAY") ;
              break ;
            case 3 :
            System.out.println("WEDNESDAY") ;
             break ;
            case 4 :
            System.out.println("thurdsay") ;
             break ;
            case 5 :
            System.out.println("friday") ;
             break ;
            case 6 :
            System.out.println("saturday") ;
              break ;
            case 7 :
             System.out.println("sunday") ;
             break ;
             default :
             System.out.println("not your day") ;


             
            
        }
 
    
           
 
    }
  }
