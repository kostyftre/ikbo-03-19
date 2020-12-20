package laboratornya_3;

class dog_1 extends dog{

 int age;
 String breed;
 String male;

 public dog_1(int age, String breed, String male) {
  this.age = age;
  this.breed = breed;
  this.male = male;
 }

 void gav(){
  System.out.println("Собака породы "+ breed +" говорит гав-гав-гав");
 }
 @Override
 void information() {
  System.out.println("Собачка породы "+ breed +" является представитлем пола"+ male+" и ей "+ age+" лет");

 }
}
