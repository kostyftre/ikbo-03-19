package laboratornya_3;

class plate extends dish {
    String color_of_plate;

    public plate(String color_of_plate) {
        this.color_of_plate = color_of_plate;
    }
    void bad_cat(){
        System.out.println("Кошка пыталась скинуть тарелку");
    }

    @Override
    public void colors() {
        System.out.println("Кошка стащила с вашей тарелки "+color_of_plate+ " цвета кусочек сосиски");
    }
}
