import java.io.Console;

class console{

    public static void main(String[] args) {
        
        String s1; char ch [];

        Console obj = System.console();
        System.out.println("Enter user name");
        s1= obj.readLine();
        System.out.println("Enter user Password");
        ch= obj.readPassword();

         String a= String.valueOf(ch);

        System.out.println("User name is" + s1);
        System.out.println("user password is" + ch);
        System.out.println("its the real password" + a);


    }
}