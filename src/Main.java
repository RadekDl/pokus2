import java.time.LocalDate;

class Dealer {
    private String name;
    private LocalDate birthday;
    private String city;
    private int contracts;
    private  double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getContracts() {
        return contracts;
    }

    public void setContracts(int contracts) {
        this.contracts = contracts;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Car {
    private String spz;
    private double consumption;

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Podejce biomrkve");

        Dealer firstDealer = new Dealer();           // první prodejce
        firstDealer.setName("Karel Vála");
        System.out.println(firstDealer.getName());
        Dealer firstCity = new Dealer();
        firstCity.setCity("Brno");
        System.out.println(firstCity.getCity());

        Dealer secondDealer = new Dealer();          // druhý prodejce
        secondDealer.setName("Pavel Mrkva");
        System.out.println(secondDealer.getName());
        Dealer secondCity = new Dealer();
        secondCity.setCity("Praha");
        System.out.println(secondCity.getCity());
    }
}