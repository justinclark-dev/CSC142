public class VertAlign {
    
    public int method1(int i) { 
        int j = 5;
        if( j > i ) {
            System.out.print(j + " is greater than ");
            System.out.println(i);
        } 
        i ++;
        return i = j * 3;
    }

    public  int method5   (int i) { 
        int j = 5;
         if( j > i) {
            System.out.print(j +" is greater than ");
        System.out.println(i);
              }  
                     i ++;
           return    i = j * 3;
               }




  
    public int method3(int i) { 
    int j = 5;
    if( j > i ) {
    System.out.print(j + " is greater than ");
    System.out.println(i);
    } 
    i ++;
    return i = j * 3;
    }
  

    public int method4(int i) { 
    int j = 5;
    if( j > i ) {
    System.out.print(j + " is greater than ");
    System.out.println(i); } 
    i ++;
    return i = j * 3; }
  







  
    public int method6(int i) { 
        int j = 5;
        if( j > i) {
            System.out.print(j + 
            " is greater than ");
            System.out.
            println(i);}
            i++;return i=j*3;  
            }int k(
            int i) { 
            int j=5; 
            if(j>i){System.
            out.print(
            j+" is greater than ");
            System.out.println(i);
        } 
        i ++;
        return i = j * 3;



    }













    public int method2(int i){ 
        int j=5; 
        if(j>i){ 
         System.out.print(j+" is greater than "); 
         System.out.println(i);
        } 
        i++; 
        return i=j*3;
       }

       public boolean nearHundred(int n) {
  
        // +/- 10 
        // 
        int num1 = Math.abs(100-n);
        System.out.println(num1);

        int num2 = Math.abs(200-n);
        System.out.println(num2);

        return (num1<10 || num2<10);
        
      }

    public static void main(String[] args) {
        VertAlign va = new VertAlign();

        System.out.println(va.nearHundred(121));
    }
}