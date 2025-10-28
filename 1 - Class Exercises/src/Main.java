//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.sayHelloWorld();

        Calculator calculator1 = new Calculator();
        calculator1.dNum = 10;
        double dCalculatorResult = calculator1.doubleTheNumber();
        System.out.println("O dobro de " + calculator1.dNum + " é : " + dCalculatorResult);

        Music music1 = new Music();
        music1.sName = "1010";
        music1.iYearReleased = 2020;
        music1.sArtist = "Djonga";
        music1.rateTheMusica(10);
        music1.rateTheMusica(10);
        music1.rateTheMusica(10);
        double dMediaMusic = music1.mediaOfTheMusic();
        System.out.println("A média da música é " + dMediaMusic);

        Car car1 = new Car();
        car1.sModel = "Nissan Skyline";
        car1.iAge = 2000;
        car1.sColor = "preto";
        car1.carInformations();
        int iAgeOfCar1 = car1.ageOfCar();
        System.out.println("O carro tem " + iAgeOfCar1 + " anos");

        Student student1 = new Student();
        student1.sName = "Henrique";
        student1.iAge = 29;
        student1.studentInformations();
    }
}