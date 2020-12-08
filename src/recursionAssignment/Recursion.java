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
  
  public static int count8(int N){
    if (N==0){
      return 0;
    } else if (N%100 ==88){
      return 2 + count8(N/10);
    } else if (N%10 == 8){
      return 1 + count8(N/10);
    } else{
      return 0 + count8(N/10);
    }
  }

  public static int countHi(String str){
    if (str.equals("")){
        return 0;
    } else if (str.substring (1,2).equals("hi")){
      return 1 + countHi(str.substring(1));
    } else{
      return 0 + countHi(str.substring(1));
    }
  }
}

