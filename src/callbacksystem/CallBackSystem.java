package callbacksystem;
import java.util.Scanner;

interface Member  
{
    public void CallBack();
}

class Store
{
    Member mem[] = new Member[50];
    int count = 0;
 
    void Register(Member m)
    {
        mem[count ++] = m;
    }
    void InviteSale()
    {
        for (int i=0; i<count; i++)
            mem[i].CallBack();
    }
}

class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name = n;
    }
    public void CallBack()
    {
        System.out.println(name+" :Ok, I will visite ");
    }
}
public class CallBackSystem 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        String n = scan.nextLine();
        
        Store s = new Store();
        Customer newCustomer = new Customer(n);
        
        s.Register(newCustomer);
        s.InviteSale();
    }
    
}
