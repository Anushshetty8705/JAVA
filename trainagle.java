public class trainagle {
    public static void main(String[] args) {
      

         int rows =4;
         for(int i =1; i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print('*');
        }
        System.out.println();
     }


//  oppsoite trangle

      int rows =4;
         for(int i =1; i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
           
            System.out.print(' ');
        }
        for(int j=1;j<=i;j++){
           
            System.out.print('*');
        }
        System.out.println();
     }


//number triangle

  int rows =4;
         for(int i =1; i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
     }




// number traingle



  int rows =4 ,number =1;
         for(int i =1; i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
     }




int rows =4 ;
         for(int i =1; i<=rows;i++){
        for(int j=1;j<=i;j++){
            if( (i+j)% 2 == 0)
                System.out.print('1' + " ");
           else
             System.out.print('0' + " ");
        }
        System.out.println();
     }
    }
}
