import java.util.*;

class rec {
   static class hasmap<k,v>{
         class node{
            k key;
            v val;
            node(k key,v val){
                this.key=key;
                this.val=val;
            }
        }



        int n = 0,N;
        LinkedList<node>[] bucket;



        @SuppressWarnings("unchecked")


        hasmap(){
            this.N =4;
           this.bucket = (LinkedList<node>[]) new LinkedList[N];
            for(int i=0;i<N;i++)
                bucket[i] = new LinkedList<>();
        }



        public int hash(k key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }



        public int searchll(k key,int bi){
            LinkedList<node> ll =  bucket[bi];
            for(int i =0;i<ll.size();i++)
                if(ll.get(i).key == key)
                     return i;
           return -1;
        }


        public void rehash(){
            LinkedList<node> old[] = bucket;
            bucket = (LinkedList<node>[]) new LinkedList[N*2];
            for(int i=0;i<bucket.length;i++)
                bucket[i] = new LinkedList<>();
            for(int i = 0;i<old.length;i++){
                LinkedList<node> ll =  old[i];
                for(int j =0;j<ll.size();j++){
                    node  ne =ll.get(j);
                    put(ne.key,ne.val);
                }
            }
        }
        public void put(k key,v val){
              int bi = hash(key);
              int di = searchll(key,bi);
              if(di == -1){
                bucket[bi].add(new node(key,val));
                n++;
              }else{
                node cur = bucket[bi].get(di);
                cur.val = val;
              }
              if((double)(n/N) >= 2.00)
                 rehash();
        }
        public void get(k key){
             int bi = hash(key);
              int di = searchll(key,bi);
              if(di == -1){
                System.out.println("no elemnent found");
              }else{
                node cur = bucket[bi].get(di);
                System.out.println(cur.val);
              }
        }
        public boolean containskey(k key){
 int bi = hash(key);
              int di = searchll(key,bi);
              return di == -1? false:true;
        }
        public boolean isEmpty(){
            return n ==0;
        }
        public void remove(k key){
            int bi = hash(key);
              int di = searchll(key,bi);
              if(di == -1){
                System.out.println("noo");
              }else{
                n--;
                node cur = bucket[bi].remove(di);
             System.out.println(cur.val);
              }
        }
        public ArrayList<k> keyset(){
            ArrayList<k> arr = new ArrayList<>();
            for(int i =0;i<bucket.length;i++){
                LinkedList<node> list = bucket[i];
                for(int j =0;j<list.size();j++)
                       arr.add(list.get(j).key);
            }
         return arr;
          
        }
    
    }
    public static void main(String[] args) {
        hasmap<String,Integer> map=new hasmap<>();
        map.put("india",100);
        map.put("chiina",2400);
       map.get("chiina");
     map.remove("india");
    System.out.println(map.containskey("india"));
    map.put("india",100); 
    System.out.println(map.containskey("india"));
     ArrayList<String> keys = map.keyset();

    for(String val : keys){
        System.out.println(val +" ");
    }
    }
}