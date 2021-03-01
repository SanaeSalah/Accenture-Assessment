import java.util.List;

public class AirportsOfCountries implements  Comparable<AirportsOfCountries>{


    private String countryByCode;
    private String countryByName;
    private Integer countingRunways;
    private List<AirportsDetails> topTenList;

    public String getCountryByCode() {
        return countryByCode;
    }

    public void setCountryByCode(String countryByCode) {
        this.countryByCode = countryByCode;
    }

    public String getCountryByName() {
        return countryByName;
    }

    public void setCountryByName(String countryByName) {
        this.countryByName = countryByName;
    }

    public Integer getCountingRunways() {
        return countingRunways;
    }

    public void setCountingRunways(Integer countingRunways) {
        this.countingRunways = countingRunways;
    }

    public List<AirportsDetails> getTopTenList() {
        return topTenList;
    }

    public void setTopTenList(List<AirportsDetails> topTenList) {
        this.topTenList = topTenList;
    }

    @Override
    public int compareTo(AirportsOfCountries o) {
        return this.getCountingRunways().compareTo(o.getCountingRunways());
    }

    @Override
    public String toString() {
        return "AirportsOfCountry [" +
                "countryByCode" + countryByCode  +
                ", countryByName=" + countryByName +
                ", countingRunways=" + countingRunways +
                ']';
    }
}
