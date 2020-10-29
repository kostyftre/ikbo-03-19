

public class Person {
   String name, surname, patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        if(patronymic==null &&name!=null){
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\''+
                    '}';

        }

        else if(name==null){
            return "Person{" +
                    "surname='" + surname + '\''+
                    '}';

        }
        else{
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", patronymic='" + patronymic + '\'' +
                    '}';
        }
    }
}
