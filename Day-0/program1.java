import java.io.*;
import java.util.*;
import java.util.scanner;

public class code1{
  public static void main(String[] arg){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Name : ");
    String A = sc.next();
    System.out.println("Enter Last Name : ");
    String B = sc.next();
    
    int len_C = A.length();
    int len_D = B.length();
    SYstem.out.println((("Output: " + A.substring(0, 1)).toUpperCase() + (A.substring(1, len_C).toLowerCase())) + " " + ((B.toUpperCase())));
  }
}
