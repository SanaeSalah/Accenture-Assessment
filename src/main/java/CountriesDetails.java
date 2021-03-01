import com.opencsv.bean.CsvBindByName;

public class CountriesDetails {

    @CsvBindByName
    private String countryById;

    @CsvBindByName
    private String countryByCode;

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String continent;

    @CsvBindByName
    private String wikipedia_link;

    @CsvBindByName
    private String keywords;

    public CountriesDetails() {
    }
    public CountriesDetails(String countryById, String countryByCode, String name, String continent, String wikipedia_link, String keywords) {
        this.countryById = countryById;
        this.countryByCode = countryByCode;
        this.name = name;
        this.continent = continent;
        this.wikipedia_link= wikipedia_link;
        this.keywords= keywords;
    }

    public String getcountryById() {
        return countryById;
    }

    public void setcountryById(String countryById) {
        this.countryById = countryById;
    }

    public String getcountryByCode() {
        return countryByCode;
    }

    public void setcountryByCode(String countryByCode) {
        this.countryByCode = countryByCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getWikipedia_link() {
        return wikipedia_link;
    }

    public void setWikipedia_link(String wikipedia_link) {
        this.wikipedia_link = wikipedia_link;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    // Selected information
    @Override
    public String toString() {
        return "CountryDetails [" +
                "countryById='" +  countryById+ '\'' +
                ", countryByCode='" + countryByCode + '\'' +
                ", name='" + name + '\'' +
                ']';
    }


// Print all information
//    @Override
//    public String toString() {
//        return "CountriesDetails [
//        id=" + id + ",
//        code=" + code + ",
//        name=" + name + ",
//        continent=" + continent + ",
//        wikipedia_link=" + wikipedia_link + ",
//        keyword=" + keywords + "]";
//    }


}
