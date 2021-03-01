import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {

    public static void main(String[] args) throws FileNotFoundException {

        String pathFile1 = "src/main/java/CSVFiles/countries.csv";
        String pathFile2 = "src/main/java/CSVFiles/airports.csv";
        String pathFile3 = "src/main/java/CSVFiles/runways.csv";

        List<CountriesDetails> countriesDetailsList = new CsvToBeanBuilder(new FileReader(pathFile1))
                .withType(CountriesDetails.class)
                .build()
                .parse();

        List<AirportsDetails> airportsDetailsList = new CsvToBeanBuilder(new FileReader(pathFile2))
                .withType(AirportsDetails.class)
                .build()
                .parse();


        List<RunwaysDetails> runwaysDetailsList = new CsvToBeanBuilder(new FileReader(pathFile3))
                .withType(RunwaysDetails.class)
                .build()
                .parse();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("\n To get the top 10 countries with highest number of airports enter Top 10");
            System.out.print("\n To get the runways for each airport enter a valid country code or country name");
            System.out.print("\n > Write: ");
            String input = scanner.nextLine();


         // Get the runways for each airport given a valid country name or country code
            for (int x = 0; x <countriesDetailsList.size() ; x++) {
                int countAirport = 0;
                if (input.equalsIgnoreCase(countriesDetailsList.get(x).getcountryByCode())
                        || input.equalsIgnoreCase(countriesDetailsList.get(x).getName())
                        || countriesDetailsList.get(x).getName().toLowerCase().startsWith(input.toLowerCase())
                ){

                    for (int y = 0; y <airportsDetailsList.size() ; y++) {

                        if (airportsDetailsList.get(y).getIso_country().equals(countriesDetailsList.get(x).getcountryByCode())){
//
                            System.out.println("\n#"+ ++countAirport + " The Airport is in " + countriesDetailsList.get(x).getName()  + ", airport name: " + airportsDetailsList.get(y).getName());

                            for (int z = 0; z < runwaysDetailsList.size(); z++) {

                                if (runwaysDetailsList.get(z).getAirport_ref().equals(airportsDetailsList.get(y).getId())){
                                    System.out.print("- runway: #"+ runwaysDetailsList.get(z).getId()+"\n");
                                }
                            }
                        }
                    }

                }
            }

        // Get the TOP 10 countries with the highest numbers or airports by entering TOP 10
        if (input.equalsIgnoreCase("TOP 10")){

            List<AirportsOfCountries> airportsOfCountries = new ArrayList<>();

            for (int x = 0; x <countriesDetailsList.size() ; x++) {

                AirportsOfCountries airportsOfCountriesObj = new AirportsOfCountries();
                airportsOfCountriesObj.setCountryByCode(countriesDetailsList.get(x).getcountryByCode());
                airportsOfCountriesObj.setCountryByName(countriesDetailsList.get(x).getName());

                List<AirportsDetails> airportsOfCountriesList = new ArrayList<>();
                for (int y = 0; y <airportsDetailsList.size() ; y++) {

                    if (airportsOfCountriesObj.getCountryByCode().equals(airportsDetailsList.get(y).getIso_country())){

                       AirportsDetails airportsDetails = new AirportsDetails();
                       airportsDetails.setId(airportsDetailsList.get(y).getId());
                       airportsDetails.setName(airportsDetailsList.get(y).getName());
                       airportsDetails.setIso_country(airportsDetailsList.get(y).getIso_country());
                       airportsOfCountriesList.add(airportsDetails);
                    }
                    airportsOfCountriesObj.setTopTenList(airportsOfCountriesList);
                }
                airportsOfCountriesObj.setCountingRunways(airportsOfCountriesList.size());
                airportsOfCountries.add(airportsOfCountriesObj);
            }
            airportsOfCountries.sort(Collections.reverseOrder());
            airportsOfCountries.subList(0, 10).forEach(System.out::println);
        }
        else{
                System.out.println(" The entered country code en country name is invalid or TOP 10 is not well written ! ");
            }
    }}}
