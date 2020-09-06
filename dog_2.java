package laboratornya_3;

class dog_2 extends dog {
    int age;
    String breed;
    String male;

    public dog_2(int age, String breed, String male) {
        this.age = age;
        this.breed = breed;
        this.male = male;
    }
    void gav(){
        System.out.println("Собака породы "+ breed +" говорит гав-гав");
    }
    @Override
    void information() {
        System.out.println("Собачка породы "+ breed +" является представитлем пола"+ male+" и ей "+ age+" лет");

    }
}
