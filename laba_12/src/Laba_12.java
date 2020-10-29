

public class Laba_12 {
    public static void main(String[] args) {

        SecondEx secondEx0 = new SecondEx("abdfhsnwbbehuirbbwghwejvbr234jbhjb12");
        System.out.println(secondEx0.isLine());

        SecondEx secondEx1 = new SecondEx("abcdefghijklmnopqrstuv18340");
        System.out.println(secondEx1.isLine());

        EmailChecker emailChecker = new EmailChecker("kostyftre@mail.ru");
        System.out.println(emailChecker.isEmail());

        EmailChecker emailChecker1 = new EmailChecker("kostyftre@@mail.ru");
        System.out.println(emailChecker1.isEmail());

        PlusChecker plusChecker = new PlusChecker("(2 + 1) / 9 / 4");
        System.out.println(plusChecker.hasPlus());

        PlusChecker plusChecker1 = new PlusChecker("(2 / 1) + 9 - 4");
        System.out.println(plusChecker1.hasPlus());
    }
}