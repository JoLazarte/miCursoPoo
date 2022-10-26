package Payment;
public class Payment {

    private Integer id;
    private Integer cash;
    private String date;
    
    public Payment(Integer id, Integer cash, String date) {
        this.id = id;
        this.cash = cash;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
}
