public class Creditcard extends Debitcard {
    private int overdraw;
    Creditcard(int id){
        super(id);
        this.overdraw=2000;
    }
    public int showOverdraw(){
        return overdraw;
    }
    @Override
    public void GetMoney(int m) {
        super.GetMoney(m);
    }

    public void setOverdraw(int overdraw) {
        this.overdraw = overdraw;
    }

    @Override
    public int getMoney() {
        return super.getMoney();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    public int getOverdraw() {
        return overdraw;
    }

    @Override
    public int StoreMoney(int m) {
        return super.StoreMoney(m);
    }

    @Override
    public int ShowMoney() {
        return super.ShowMoney();
    }

}
