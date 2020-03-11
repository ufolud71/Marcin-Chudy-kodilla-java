package challange3;

public class Flight {
    private String nameAirPortFrom;
    private String nameAirPortTo;


    public Flight(String nameAirPortFrom, String nameAirPortTo) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortTo = nameAirPortTo;
    }

    public String getNameAirPortFrom() {
        return nameAirPortFrom;
    }

    public String getNameAirPortTo() {
        return nameAirPortTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getNameAirPortFrom().equals(flight.getNameAirPortFrom())) return false;
        return getNameAirPortTo().equals(flight.getNameAirPortTo());
    }

    @Override
    public int hashCode() {
        int result = getNameAirPortFrom().hashCode();
        result = 31 * result + getNameAirPortTo().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "nameAirPortFrom='" + nameAirPortFrom + '\'' +
                ", nameAirPortTo='" + nameAirPortTo + '\'' +
                '}';
    }
}
