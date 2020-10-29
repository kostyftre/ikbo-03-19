import java.util.StringTokenizer;

public class Address_second_b {
    String country, region, town, street, home, building, apartment, start;
    String symbol="";
    public Address_second_b(String start) {
        this.start = start;
    }

    public void TokenizerS(){

        for(int i=0;i<start.length();i++){
            if ('.' == start.charAt(i) || ' '== start.charAt(i) ||';' == start.charAt(i) ||',' == start.charAt(i)) {
                symbol=symbol+ start.charAt(i);
                break;
            }

        }
        StringTokenizer st = new StringTokenizer(start,symbol);

        country = st.nextToken();
        region = st.nextToken();
        town = st.nextToken();
        street = st.nextToken();
        home = st.nextToken();
        building = st.nextToken();
        apartment = st.nextToken();
    }

    @Override
    public String toString() {
        return "Address_second_b{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", home='" + home + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\''+
                ", Разделяющий знак='" + symbol + '\'' +
                '}';
    }
}
