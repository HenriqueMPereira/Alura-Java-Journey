public class Car {
    String sModel, sColor;
    int iAge;

    void carInformations () {
        System.out.println("O modelo do carro é: " + sModel);
        System.out.println("A cor do carro é: " + sColor);
        System.out.println("O carro é do ano: " + iAge);
    }

    int ageOfCar () {
        return (2025 - iAge);
    }
}
