import com.opencsv.bean.CsvBindByName;

public class AirportsDetails {

    @CsvBindByName
    private String id;

    @CsvBindByName
    private String ident;

    @CsvBindByName
    private String type;

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String latitude_deg;

    @CsvBindByName
    private String longitude_deg;

    @CsvBindByName
    private String elevation_ft;

    @CsvBindByName
    private String continent;

    @CsvBindByName
    private String iso_country;

    @CsvBindByName
    private String iso_region;

    @CsvBindByName
    private String municipality;

    @CsvBindByName
    private String scheduled_service;

    @CsvBindByName
    private String gps_code;

    @CsvBindByName
    private String iata_code;

    @CsvBindByName
    private String local_code;

    @CsvBindByName
    private String home_link;

    @CsvBindByName
    private String wikipedia_link;

    @CsvBindByName
    private String keywords;

    public AirportsDetails() {
    }
    public AirportsDetails(String id, String ident, String type, String name, String latitude_deg, String elevation_ft, String continent, String iso_region, String municipality, String scheduled_service, String gps_code, String iata_code, String home_link, String wikipedia_link, String keywords) {
        this.id = id;
        this.ident = ident;
        this.type = type;
        this.name = name;
        this.latitude_deg = latitude_deg;
        this.elevation_ft = elevation_ft;
        this.iso_region=iso_region;
        this.municipality= municipality;
        this.scheduled_service= scheduled_service;
        this.gps_code=gps_code;
        this.iata_code=iata_code;
        this.home_link=home_link;
        this.continent = continent;
        this.wikipedia_link= wikipedia_link;
        this.keywords= keywords;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude_deg() {
        return latitude_deg;
    }

    public void setLatitude_deg(String latitude_deg) {
        this.latitude_deg = latitude_deg;
    }

    public String getLongitude_deg() {
        return longitude_deg;
    }

    public void setLongitude_deg(String longitude_deg) {
        this.longitude_deg = longitude_deg;
    }

    public String getElevation_ft() {
        return elevation_ft;
    }

    public void setElevation_ft(String elevation_ft) {
        this.elevation_ft = elevation_ft;
    }

    public String getContinent(String s) {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    public String getIso_region() {
        return iso_region;
    }

    public void setIso_region(String iso_region) {
        this.iso_region = iso_region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getScheduled_service() {
        return scheduled_service;
    }

    public void setScheduled_service(String scheduled_service) {
        this.scheduled_service = scheduled_service;
    }

    public String getGps_code() {
        return gps_code;
    }

    public void setGps_code(String gps_code) {
        this.gps_code = gps_code;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }

    public String getHome_link() {
        return home_link;
    }

    public void setHome_link(String home_link) {
        this.home_link = home_link;
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

//Selected information
    @Override
    public String toString() {
        return "AirportDetails[" +
                ", name='" + name + '\'' +
                ", iso_country='" + iso_country + '\'' +
                ']';
    }

//    Print all information
//    @Override
//    public String toString() {
//        return "AirportDetails [
//        id=" + id + ",
//        ident=" + ident + ",
//        type=" + type + ",
//        name=" + name + ",
//        latitude_deg=" + latitude_deg + ",
//        elevation_ft=" + elevation_ft + ",
//        iso_region=" + iso_region + ",
//        municipality=" + municipality + ",
//        scheduled_service=" + scheduled_service + ",
//        gps_code=" + gps_code + ",
//        iata_code=" + iata_code + ",
//        home_link=" + home_link+ ",
//        continent=" + continent + ",
//        wikipedia_link=" + wikipedia_link+ ",
//        keywords=" + keywords+ "]";
//    }
}
