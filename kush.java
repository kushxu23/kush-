import java.util.*;
 public class kush {
  public static void main(String [] args)  {
    Scanner sc = new Scanner(System.in) ;
    int A = sc.nextInt();
    int B = sc.nextInt();
    char opertor = sc.next().charAt(0);
     switch (opertor) {
        case '+':
        System.out.println(A+B) ;
         break ;
        case '-' :
        System.out.println(A-B) ;
         break ;
        case '*' :
        System.out.println(A*B) ;
         break ;
        case '/' :
        System.out.println(A/B) ;
         break ;
         default :
         System.out.println("SORRY WRONG OPERTOR ") ;
     }
  }
}

