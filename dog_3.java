package laboratornya_3;


class dog_3 extends dog {
    int age;
    String breed;
    String male;

    public dog_3(int age, String breed, String male) {
        this.age = age;
        this.breed = breed;
        this.male = male;
    }
    void gav(){
        System.out.println("Собака породы "+ breed +" говорит гав");
    }

    @Override
    void information() {
        System.out.println("Собачка породы "+ breed +" является представитлем пола"+ male+" и ей "+ age+" лет");

    }
}
