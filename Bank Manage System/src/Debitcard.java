public class  Debitcard implements Card{
    private long id;
    private int money;
    Debitcard(long id){
        this.id=id;
    }

    @Override
    public int ShowMoney() {
        return money;
    }

    @Override
    public int StoreMoney(int m) {
        if(m>=0)
        money +=m;
        else System.out.println("不能存负数的钱！");
        return money;
    }

    @Override
    public void GetMoney(int m) {
        if (m>=0)
        money-=m;
        else System.out.println("不能取负数的钱！");
    }

    public int getMoney() {
        return money;
    }

    public long getId() {
        return id;
    }
}
