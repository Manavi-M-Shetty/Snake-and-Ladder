package player;

import java.util.Scanner;

public class Player {
    String name;
    String age;
    String contactnum;
    String email;
    String address;
    public void setPlayerdetails( String name,String age,String contactnum,String email,String address)
    {
        this.name=name;
        this.age=age;
        this.contactnum=contactnum;
        this.email=email;
        this.address=address;

    }
    public void setPlayername(String name)
    {
        this.name=name;
    }
    public void getPlayerdetails()
    {
        System.out.println("Name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("address:"+this.address);
        System.out.println("contact:"+this.contactnum);
        System.out.println("email:"+this.email);
    }
    public String getPlayername()
    {
        return this.name; 
    }
    public  Player setPlayerdetailsfromInput()
{
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter age");
        String age=sc.nextLine();
        System.out.println("Enter address");
        String address=sc.nextLine();
        System.out.println("Enter contactnumber");
        String contactnum=sc.nextLine();
        System.out.println("Enter email");
        String email=sc.nextLine();
        Player p=new Player();
        p.setPlayerdetails(name,age,contactnum,email,address);
        return p;
}



}
