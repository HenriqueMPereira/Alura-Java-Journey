import br.com.minhaempresa.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(0,0,"Henrique");

        bankAccount1.setAccountNumber(1);
        bankAccount1.setBankBalance(2235.38);
        bankAccount1.accountOwner =  "Henrique Morey Pereira";
        bankAccount1.accountInformations();

        PersonsAge pessoa1 = new PersonsAge("Henrique PPeriera", 28);

        pessoa1.setName("Henrique Morey Pereira");
        pessoa1.setAge(29);
        pessoa1.verifyAge();

        Product product1 = new Product("Garrafa", 300);
        product1.showProductInfos();
        product1.setName("Garrafa Térmica");
        product1.setPrice(200);
        product1.showProductInfos();
        product1.applyDiscount(10);
        product1.showProductInfos();

        Student student1 = new Student("Marcela",0 ,0,0);
        student1.setScore1(10);
        student1.setScore2(10);
        student1.setScore3(10);
        double media = student1.getMedia();
        System.out.println("O aluno " + student1.getName() + " ficou com média: " + media);

        Book book1 = new Book("Pequeno Príncipe", "Anthoine");
        book1.showBookInfos();
        book1.setTitle("O Pequeno Príncipe");
        book1.setAuthor("Antoine");
        book1.showBookInfos();
    }
}