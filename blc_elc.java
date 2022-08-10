//import javax.sql.rowset.spi.SyncResolver;

class blc_elc{
    // Business logic class / executable logic class

    public static void main(String[] args) {
        subha s= new subha();
        s.input();
         s.show();
        candy c=  new candy();
        c.input();
         c.show();
        
    }
}

class subha{
     int a,b,c,d;

     void input(){
        a=10;b=20;
   }

   void show(){
     c= a+b;
     d= a*b;
     System.out.println(c +" "+ d);
   }
}

class candy{
    int a,b,c,d;
     void input(){
        a=20;c=37;
        
     }
    
     void show(){
        b= a-c;
        d= a+c;
        System.out.println(b +" "+d);
     }
}