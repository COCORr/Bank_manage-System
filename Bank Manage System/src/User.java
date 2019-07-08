import java.util.Scanner;

public class User {
    private String username;
    private String password;
    public static Debitcard[] debitcards=new Debitcard[30];
    public User(String usn,String pwd){
        Scanner scanner=new Scanner(System.in);
        if (usn!=null&&pwd!=null){
        this.username=usn;
        this.password=pwd;
        }
        if (usn==null) {
            System.out.println("用户名为空！");//重新输入
        }
        if (pwd==null)
            System.out.println("密码为空！");
        if (usn.length()<3)
            System.out.println("用户名过短");
        if (usn.length()>20)
            System.out.println("用户名过长");
    }
    public boolean checkPassword(String pwd){
        if (pwd.equals(getPassword()))
            return true;
        else return false;
    }
    public void addDebitcard(){
        //*卡号密码都需要的版本 De和Cred都加一个password
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入卡号：");
//        long   cardnumber=scanner.nextInt() ;
        int index=0;
        for (;index<30;index++)
            if (debitcards[index]==null){
                debitcards[index]=new Debitcard(index);
                break;
            }
       // return debitcards[index];

    }
    public Creditcard addCreditcard(){
        int index=0;

        for (;index<30;index++)
            if (debitcards[index]==null){

                debitcards[index]=new Creditcard(index);
                break;
            }
        Creditcard temp=new Creditcard(index);
        return temp;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
    
}
