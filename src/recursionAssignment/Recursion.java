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
    if (str.equals("")){
      return "";
    }else if (str.substring (0,1).equals("pi")){
      String strpi = "3.14";
      return changePi(strpi+ str.substring(1));
    } else{
      return changePi(str.substring (0) + str.substring(1));
    }
  }

  public static String stringClean(String str){
    if (str.equals("")){
      return "";
    }else if (str.substring (0).equals(str.substring (1))){
      return  stringClean(str.substring(1)+str.substring (2));
    } else{
      return stringClean(str.substring(0)+str.substring(1));
    }
  }
}

