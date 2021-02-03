/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

/**
 *
 * @author zaruk
 */
public class Coding {
public boolean makeBricks(int small, int big, int goal) {
  if (small+big*5<goal){
    return false;
  }
  if (small>=goal%5){
    return true;
  }
  if (small+big*5>=goal){
    return false;
  }
  
    return true;
  }

public int loneSum(int a, int b, int c) {
         if (a!=b && a!=c && b!=c){
            return a+c+b;
           
        }
        if (a==b && a!=c && b!=c){
            return c;
           
        }
        if (a!=b && a==c && b!=c){
            return b;
           
        }
        if (a!=b && a!=c && b==c){
            return a;
           
        }
        if (a==b && a==c && b==c){
            return 0;
           
        }

 
        return a+b+c;
    }

public int luckySum(int a, int b, int c) {
  if (a==13 && b!= 13 && c !=13){
    return 0;
  }
   if (a!=13 && b== 13 && c !=13){
    return a;
  }
   if (a!=13 && b!= 13 && c ==13){
    return a+b;
  }
  if (a==13 && b== 13 && c !=13){
    return 0;
  }
  if (a==13 && b!= 13 && c ==13){
    return 0;
  }
  if (a!=13 && b== 13 && c ==13){
    return a;
  }
  return a+b+c;
 
 
}
public int noTeenSum(int a, int b, int c) {

return fixTeen(a)+fixTeen(b)+fixTeen(c);

}


public int fixTeen(int n){
  if(13 <=n && n < 15||16 < n &&n <= 19){
    return 0;
  }
  

  else {
    return n;
  }
}
public int roundSum(int a, int b, int c) {
  
   
   return round10( a)+round10( b)+round10( c);
}
public int round10(int num){
  
  int num2= num%10;
  
  if(num2<5){
    return num-num%10;
  }

    return num+(10-num%10);
  }

public int blackjack(int a, int b) {
  if (a<22||b<22){
    if(a<22&&b<22){
      if (a<b){
        return b;
      }
      if (b<a){
        return a;
      }
      
    }
    else if(a>22&&b<22){
       return b;
       
     }
    else  if(a<22&&b>22){
        return a;
      }
  }
  return a>b=a;
}
public boolean evenlySpaced(int a, int b, int c) {
  int suma1;
 int suma2;
    if(c>b&&b>a){
   suma1=c-b;
   suma2=b-a;
    if (suma1==suma2){
      return true;
    }
  }
  if (b>c&&c>a){
    suma1=b-c;
    suma2=c-a;
    if (suma1==suma2){
      return true;
    }
  }
   if (a>c&&c>b){
    suma1=a-c;
    suma2=c-b;
    if (suma1==suma2){
      return true;
    }
   }
    if (b>a&&a>c){
    suma1=b-a;
    suma2=a-c;
    if (suma1==suma2){
      return true;
    }
    }
     if (c>a&&a>b){
    suma1=c-a;
    suma2=a-b;
    if (suma1==suma2){
      return true;
    }
     }
      if (a==b&&b==c){
   
      return true;
    }
  return false;
  
}
public int makeChocolate(int small, int big, int goal) {
if (goal/(big*5)<1){
  big=big-5;
  if(big==goal ){
    return 0;
    
  }
  else if(small+big<goal){
    return -1;
  }
}
else if (goal/(big*5)==1){
  return 0;
}
return small;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
