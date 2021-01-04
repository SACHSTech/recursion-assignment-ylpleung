package recursionAssignment;
import java.io.*;

public class Recursion{
  
  public static int count7(int n){

    if (n ==0){
      return 0;
    }else if(n%10==7){
      return 1 +count7(n/10);
    }else{
      return 0 + count7(n/10);
    }
  }
  
  public static String changePi(String str){
    if (str.length()<2){
      return str;
    }else if (str.substring (0,2).equals("pi")){
      String strpi = "3.14";
      return strpi +changePi(str.substring(2));
    } else{
      return str.substring(0,1) +changePi( str.substring(1));
    }
  }

  public static String stringClean(String str){
    if (str.length()<2){
      return str;
    }else if (str.substring (0,1).equals(str.substring (1,2))){
      return str.substring(1,2) + stringClean(str.substring (2));
    } else{
      return str.substring(0,1) + stringClean(str.substring(1));
    }
  }
}

