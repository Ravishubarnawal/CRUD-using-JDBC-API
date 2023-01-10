package CRUD;
public class Laptop {
    private int Id;
    private String lapName;
    private int lapPrice;

    public Laptop(int Id, String lapName, int lapPrice) {
        this.Id = Id;
        this.lapName = lapName;
        this.lapPrice = lapPrice;
    }

    public int getLapId() {
        return Id;
    }

    public void setLapId(int lapId) {
        this.Id = Id;
    }

    public String getLapName() {
        return lapName;
    }

    public void setLapName(String lapName) {
        this.lapName = lapName;
    }

    public int getLapPrice() {
        return lapPrice;
    }

    public void setLapPrice(int lapPrice) {
        this.lapPrice = lapPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Id=" + Id +
                ", lapName='" + lapName + '\'' +
                ", lapPrice=" + lapPrice +
                '}';
    }
}
