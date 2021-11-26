package defaultconstructor;

public class SimpleDateFormatter {

    private CountryCode countryCode;

    public SimpleDateFormatter() {
        countryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate){
        return formatDateStringByCountryCode(countryCode,simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        StringBuilder sb = new StringBuilder();
        if (countryCode == CountryCode.HU){
            return sb.append(simpleDate.getYear()).append("-").append(simpleDate.getMonth()).append("-").append(simpleDate.getDay()).toString();
        } else if (countryCode == CountryCode.EN){
            return sb.append(simpleDate.getDay()).append("-").append(simpleDate.getMonth()).append("-").append(simpleDate.getYear()).toString();
        } else {
            return sb.append(simpleDate.getMonth()).append("-").append(simpleDate.getDay()).append("-").append(simpleDate.getYear()).toString();
        }
    }
}
