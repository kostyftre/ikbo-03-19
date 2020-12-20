

class Address{
    final String cityName;
    final int zipCode, age, buildingNumber, apartmentNumber;
    final char buildingLetter;
    static Address EMPTY_ADDRESS = new Address(null, 0, 0, 0, 0, '-');

    public Address(String cityName, int zipCode, int age, int buildingNumber, int apartmentNumber, char buildingLetter) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.age = age;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.buildingLetter = buildingLetter;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", age=" + age +
                ", buildingNumber=" + buildingNumber +
                ", apartmentNumber=" + apartmentNumber +
                ", buildingLetter=" + buildingLetter +
                '}';
    }
}
