import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class login_in {
    static ArrayList<String> namelist=new ArrayList<>();
    static ArrayList<String> pwdlist=new ArrayList<>();
    static User user=null;
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        Menu();
        System.out.println("感谢您的使用");
//        System.out.println("欢迎进入划水银行系统😀");
//        System.out.println("请选择您需要的服务：");
//        System.out.println("1:用户注册 2：用户登陆 ");
//        System.out.println("按其他按键退出系统。");
//        char mc = scanner.next().charAt(0);
//        switch (mc) {
//            case '1':
//                System.out.println("请输入您的用户名：");
//                String newname = scanner.next();
//                System.out.println("请输入您的密码：");
//                String newpassword = scanner.next();
//                user = new User(newname, newpassword);
//                System.out.println("请再次输入密码:");
//                if (user.checkPassword(scanner.next())) {
//                    //添加到txt
//                    System.out.println("注册成功！");
//
//                } else {
//                    System.out.println("两次输入密码不一致，将跳转至主菜单");
//
//                }
//                //menu
//                break;
//            case '2':
//
//
//                System.out.println("请输入你的用户名和密码：");
//
//                user = new User(scanner.next(), scanner.next());
//                System.out.println("请再次输入密码");
//                if (user.checkPassword(scanner.next())) {
//                    System.out.println("请选择操作：");
//                    System.out.println("1:存钱 2：取钱 3:添加新卡");
//                    int choice = scanner.nextInt();
//                    switch (choice) {
//                        case 1:
//                            System.out.println("请输入卡号：");
//                            int cardid = scanner.nextInt();
//                            try {
//                                if (user.debitcards[cardid] != null) {
//                                    System.out.println("请输入要存的钱数：");
//                                    user.debitcards[cardid].StoreMoney(scanner.nextInt());
//                                    System.out.println("操作完成");
//                                    System.out.println("现在卡内有" + user.debitcards[cardid].ShowMoney() + "元");
//                                }
//                            } catch (Exception e) {
//                                System.out.println("卡号输入错误，不存在此卡");
//                            }
//                            break;
//                        case 2:
//                            int cd;
//                            int money;
//                            System.out.println("请选择卡的类型");
//                            System.out.println("1:借记卡 2：信用卡");
//                            int type = scanner.nextInt();
//                            switch (type) {
//                                case 1:
//                                    System.out.println("请输入卡号：");
//                                    cd = scanner.nextInt();
//                                    try {
//                                        System.out.println("请输入要取的钱数：");
//                                        money = scanner.nextInt();
//                                        if (money <= user.debitcards[cd].getMoney())
//                                            user.debitcards[cd].GetMoney(money);
//                                    } catch (Exception e) {
//                                        System.out.println("此卡余额不足！");
//                                    }
//                                case 2:
//                                    System.out.println("请输入卡号：");
//                                    cd = scanner.nextInt();
//                                    if (user.debitcards[cd] instanceof Creditcard)
//                                        try {
//                                            Creditcard temp = (Creditcard) user.debitcards[cd];
//                                            System.out.println("请输入要取的钱数：");
//                                            money = scanner.nextInt();
//                                            if (money <= user.debitcards[cd].getMoney()) {
//                                                user.debitcards[cd].GetMoney(money);
//                                                System.out.println("余额还有：" + user.debitcards[cd].getMoney() + "信用额度还有：" + temp.showOverdraw());
//                                            }
//                                            if (money > user.debitcards[cd].getMoney() && money
//                                                    <= temp.getMoney() + temp.showOverdraw()) {
//                                                temp.setOverdraw(temp.showOverdraw() + temp.getMoney() - money);
//                                                temp.GetMoney(temp.getMoney());
//                                                user.debitcards[cd] = temp;
//                                                System.out.println("余额还有：" + user.debitcards[cd].getMoney() + "信用额度还有：" + temp.showOverdraw());
//                                            } else System.out.println("所输入的钱数大于余额和信用额度总和");
//                                            break;
//                                        } catch (Exception e) {
//                                            System.out.println("输入卡号有误");
//                                            break;
//                                        }
//
//                                default:
//                                    System.out.println("输入有误。");
//                                    break;
//                            }
//                        case 3:
//                            System.out.println("请选择添加卡的类型：");
//                            System.out.println("1:借记卡 2：信用卡");
//                            int addCardTyoe = scanner.nextInt();
//
//                            switch (addCardTyoe) {
//                                case 1:
//                                    user.addDebitcard();
//                                    System.out.println("添加借记卡成功！");
//                                    break;
//                                case 2:
//                                    user.addCreditcard();
//                                    System.out.println("添加信用卡成功！");
//                                    break;
//                                default:
//                                    System.out.println("输入有误，添加失败。");
//                                    break;
//                            }
//                        default:
//                            System.out.println("123输入有误。");
//                            break;
//                    }
//                } else
//                    System.out.println("两次密码输入不一致。");
//        }
    }
    static public void   Menu() throws IOException{
        Scanner scanner = new Scanner(System.in);
        User user = null;
        System.out.println("欢迎进入划水银行系统😀");
        System.out.println("请选择您需要的服务：");
        System.out.println("1:用户注册 2：用户登陆 ");
        System.out.println("按其他按键退出系统。");
        char mc = scanner.next().charAt(0);
        switch (mc) {
            case '1':
                System.out.println("请输入您的用户名：");
                String newname = scanner.next();
                System.out.println("请输入您的密码：");
                String newpassword = scanner.next();
                user = new User(newname, newpassword);
                System.out.println("请再次输入密码:");
                if (user.checkPassword(scanner.next())) {
                    //添加到txt
                    WriteToFile(newname,newpassword);
                    System.out.println("注册成功！");

                } else {
                    System.out.println("两次输入密码不一致，将跳转至主菜单");

                }
                Menu();
                break;
            case '2':
                System.out.println("请输入你的用户名和密码：");
                String tempUserName=scanner.next();
                String tempUserPassword=scanner.next();
                user = new User(tempUserName,tempUserPassword);
                System.out.println("请再次输入密码");
                if (user.checkPassword(scanner.next())) {
                    ListFile();
                    if (CheckIfInFile(tempUserName,tempUserPassword)){


//                    System.out.println("请选择操作：");
//                    System.out.println("1:存钱 2：取钱 3:添加新卡");
                        Operation(user);



//                    int choice = scanner.nextInt();
//                    switch (choice) {
//                        case 1:
//                            System.out.println("请输入卡号：");
//                            int cardid = scanner.nextInt();
//                            try {
//                                if (user.debitcards[cardid] != null) {
//                                    System.out.println("请输入要存的钱数：");
//                                    user.debitcards[cardid].StoreMoney(scanner.nextInt());
//                                    System.out.println("操作完成");
//                                    System.out.println("现在卡内有" + user.debitcards[cardid].ShowMoney() + "元");
//                                }
//                                else {
//                                    System.out.println("卡号输入错误，不存在此卡");
//                                    System.out.println("将跳转至主界面");
//                                }
//                            } catch (Exception e) {
//                                System.out.println("卡号输入错误，不存在此卡");
//                            }
//                            break;
//                        case 2:
//                            int cd;
//                            int money;
//                            System.out.println("请选择卡的类型");
//                            System.out.println("1:借记卡 2：信用卡");
//                            int type = scanner.nextInt();
//                            switch (type) {
//                                case 1:
//                                    System.out.println("请输入卡号：");
//                                    cd = scanner.nextInt();
//                                    try {
//                                        System.out.println("请输入要取的钱数：");
//                                        money = scanner.nextInt();
//                                        if (money <= user.debitcards[cd].getMoney())
//                                            user.debitcards[cd].GetMoney(money);
//                                    } catch (Exception e) {
//                                        System.out.println("此卡余额不足！");
//                                    }
//                                case 2:
//                                    System.out.println("请输入卡号：");
//                                    cd = scanner.nextInt();
//                                    if (user.debitcards[cd] instanceof Creditcard)
//                                        try {
//                                            Creditcard temp = (Creditcard) user.debitcards[cd];
//                                            System.out.println("请输入要取的钱数：");
//                                            money = scanner.nextInt();
//                                            if (money <= user.debitcards[cd].getMoney()) {
//                                                user.debitcards[cd].GetMoney(money);
//                                                System.out.println("余额还有：" + user.debitcards[cd].getMoney() + "信用额度还有：" + temp.showOverdraw());
//                                            }
//                                            if (money > user.debitcards[cd].getMoney() && money
//                                                    <= temp.getMoney() + temp.showOverdraw()) {
//                                                temp.setOverdraw(temp.showOverdraw() + temp.getMoney() - money);
//                                                temp.GetMoney(temp.getMoney());
//                                                user.debitcards[cd] = temp;
//                                                System.out.println("余额还有：" + user.debitcards[cd].getMoney() + "信用额度还有：" + temp.showOverdraw());
//                                            } else System.out.println("所输入的钱数大于余额和信用额度总和");
//                                            break;
//                                        } catch (Exception e) {
//                                            System.out.println("输入卡号有误");
//                                            break;
//                                        }
//
//                                default:
//                                    System.out.println("输入有误。");
//                                    break;
//                            }
//                        case 3:
//                            System.out.println("请选择添加卡的类型：");
//                            System.out.println("1:借记卡 2：信用卡");
//                            int addCardType = scanner.nextInt();
//
//                            switch (addCardType) {
//                                case 1:
//                                    user.addDebitcard();
//                                    System.out.println("添加借记卡成功！");
//                                    break;
//                                case 2:
//                                    user.addCreditcard();
//                                    System.out.println("添加信用卡成功！");
//                                    break;
//                                default:
//                                    System.out.println("输入有误，添加失败。");
//                                    break;
//                            }
//                            break;
//                        default:
//                            //有问题
//                            System.out.println("123输入有误。");
//                            break;
//                    }
                    }
                } else
                    System.out.println("两次密码输入不一致。");
                Menu();
                default:
                    //多次调用会Menu会重复输出 放到主函数里
                    //System.out.println("感谢您的使用");
                    break;
        }
    }
    static public void WriteToFile(String name,String password) throws IOException{
        File file = new File("E:\\小学期\\userlist.txt");
        if (file.exists()) {
            FileWriter fileWriter=new FileWriter(file,true);
            //BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            //bufferedWriter.write(name+"\r\n");
            //bufferedWriter.write(password+"\r\n");
            //bufferedWriter.close();
            fileWriter.write(name+"\r\n");
            fileWriter.write(password+"\r\n");
            fileWriter.close();
        }
    }
    static public void ListFile()throws  IOException{
        File file = new File("E:\\小学期\\userlist.txt");
        if (file.exists()) {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = "";
            line = bufferedReader.readLine();
            if (line!=null)
                namelist.add(line);
            boolean turn = false;
            while (line != null) {
                if (turn) {
                    line = bufferedReader.readLine();
                    if (line!=null)
                    namelist.add(line);
                    turn = false;
                }
                if (!turn) {
                    line = bufferedReader.readLine();
                    if (line!=null)
                    pwdlist.add(line);
                    turn = true;
                }

            }
        }
    }
    static public boolean CheckIfInFile(String name,String password) {
        Iterator<String> nameIter=namelist.iterator();
        Iterator<String> pswIter=pwdlist.iterator();
        String tempStrName=null;
        String tempStrPassword=null;
        while (nameIter.hasNext()){
            tempStrName=nameIter.next();
            tempStrPassword=pswIter.next();
            if (tempStrName.equals(name)){
                if (tempStrPassword.equals(password)){
                    System.out.println("登陆成功");
                    return true;
                }else {
                    System.out.println("密码错误");
                    return false;
                }
            }
            //System.out.println("name :"+nameIter.next());
            //System.out.println("pass :"+pswIter.next());
        }
        //if (!nameIter.hasNext()&&!namelist.get(namelist.size()).equals(name))
            System.out.println("不存在此账号");
        return false;
    }
    static public void Operation(User user){
        System.out.println("请选择操作：");
        System.out.println("1:存钱 2：取钱 3:添加新卡");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("请输入卡号：");
                int cardid = scanner.nextInt();
                try {
                    if (user.debitcards[cardid] != null) {
                        System.out.println("请输入要存的钱数：");
                        user.debitcards[cardid].StoreMoney(scanner.nextInt());
                        System.out.println("操作完成");
                        System.out.println("现在卡内有" + user.debitcards[cardid].ShowMoney() + "元");
                    }
                    else {
                        System.out.println("卡号输入错误，不存在此卡");
                        System.out.println("将跳转至主界面");
                    }
                } catch (Exception e) {
                    System.out.println("卡号输入错误，不存在此卡");
                }
                Operation(user);
                break;
            case 2:
                int cd;
                int money;
                System.out.println("请选择卡的类型");
                System.out.println("1:借记卡 2：信用卡");
                int type = scanner.nextInt();
                switch (type) {
                    case 1:
                        System.out.println("请输入卡号：");
                        cd = scanner.nextInt();
                        try {
                            System.out.println("请输入要取的钱数：");
                            money = scanner.nextInt();
                            if (money <= user.debitcards[cd].getMoney())
                                user.debitcards[cd].GetMoney(money);
                        } catch (Exception e) {
                            System.out.println("此卡余额不足！");
                        }
                    case 2:
                        System.out.println("请输入卡号：");
                        cd = scanner.nextInt();
                        if (user.debitcards[cd] instanceof Creditcard)
                            try {
                                Creditcard temp = (Creditcard) user.debitcards[cd];
                                System.out.println("请输入要取的钱数：");
                                money = scanner.nextInt();
                                if (money <= user.debitcards[cd].getMoney()) {
                                    user.debitcards[cd].GetMoney(money);
                                    System.out.println("余额还有：" + user.debitcards[cd].getMoney() + "信用额度还有：" + temp.showOverdraw());
                                }
                                if (money > user.debitcards[cd].getMoney() && money
                                        <= temp.getMoney() + temp.showOverdraw()) {
                                    temp.setOverdraw(temp.showOverdraw() + temp.getMoney() - money);
                                    temp.GetMoney(temp.getMoney());
                                    user.debitcards[cd] = temp;
                                    System.out.println("余额还有：" + user.debitcards[cd].getMoney() + "信用额度还有：" + temp.showOverdraw());
                                } else System.out.println("所输入的钱数大于余额和信用额度总和");
                                break;
                            } catch (Exception e) {
                                System.out.println("输入卡号有误");
                                break;
                            }

                    default:
                        System.out.println("输入有误。");
                        break;
                }
                Operation(user);
                break;
            case 3:
                System.out.println("请选择添加卡的类型：");
                System.out.println("1:借记卡 2：信用卡");
                int addCardType = scanner.nextInt();

                switch (addCardType) {
                    case 1:
                        user.addDebitcard();
                        System.out.println("添加借记卡成功！");
                        break;
                    case 2:
                        user.addCreditcard();
                        System.out.println("添加信用卡成功！");
                        break;
                    default:
                        System.out.println("输入有误，添加失败。");
                        break;
                }
                Operation(user);
                break;
            default:
                System.out.println("输入有误。");
                break;
        }
    }
    static public void Lists(){
        Iterator<String> iterator=namelist.iterator();
        Iterator<String >iterator1=pwdlist.iterator();
        while (iterator.hasNext())
            System.out.println("name:"+iterator.next());
        while (iterator1.hasNext())
            System.out.println("password:"+iterator1.next());

    }

}
