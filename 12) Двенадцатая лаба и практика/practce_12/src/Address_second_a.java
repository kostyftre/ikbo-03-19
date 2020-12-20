public class Address_second_a {
    String country, region, town, street, home, building, apartment, start;

    public Address_second_a(String start) {
        this.start = start;
    }

    public void splitter(){

        String[] words = start.split(" ");
        country=words[0];
        region=words[1];
        town=words[2];
        street=words[3];
        home=words[4];
        building=words[4];
        apartment=words[4];
    }

    @Override
    public String toString() {
        return "Address_second_a{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", home='" + home + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\''+
                '}';
    }
}
