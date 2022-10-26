package Payment;
class Card extends Payment{

    private Integer number;
    private String date;
    private Integer cvv;   

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Card(Integer id, Integer cash, String date) {
        super(id, cash, date);
    }
    
}
