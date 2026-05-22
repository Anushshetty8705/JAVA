class rec{
    public static void fib(int n,String src,String help,String dest){
        // time complexity 2^n
          if(n == 1){
            System.out.println(n+"disk from "+src +"to"+dest);
            return;
          }
           fib(n-1,src,dest,help);
          System.out.println(n+"disk from    "+src +"  to   "+dest);
          fib(n-1,help,src,dest);


        // // time complexity o(n)
        //   if(n <=0){
        //     return;
        // }
        // int c = a+b;
        // System.out.println(c);
      
        // fib(b,c,n-1);

    }
    public static void main(String[] args) {
        System.out.println("0,1");
        fib(3,"s","h","d");
    }
}