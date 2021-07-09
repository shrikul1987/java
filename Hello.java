///Client
public class Hello
{

   public static void main(String[] args) {

        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        //Check both instance are same
        if(s1 == s2)
        {

            System.out.println("Singleton Works!!!");
        }
        else{

            System.out.println("Singleton not working!!!");
        }
   }
}