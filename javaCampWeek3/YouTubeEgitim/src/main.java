import java.security.PrivateKey;

public class main {

    public static void main(String[] args) {

//        int sayi1 = 10;
//        int sayi2 = 20;
//        sayi1 = sayi2;
//        sayi2 = 100;
//        System.out.println(sayi1);
//
//        int[] sayilar1 = new int[]{1, 2, 3};
//        int[] sayilar2 = new int[]{10, 20, 30};
//        sayilar1 = sayilar2;
//        sayilar2[0] = 1000;
//        System.out.println(sayilar1[0]);
//
//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.calculate();
//        creditManager.save();
//
//        Customer customer = new Customer();
//        customer.id = 1;
//        customer.city = "Ankara";
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.save();
//        customerManager.delete();
//
//        Company company = new Company();
//        company.taxNumber = "111";
//        company.companyName = "Arçelik";
//        company.id = 100;
//
//        CustomerManager customerManager1 = new CustomerManager(new Person());
//
//        Person person = new Person();
//        person.firstName = "";
//        person.nationalIdentity = "";
//
//      Customer customer1 = new Customer();
//      Customer customer2 = new Person();
//      Customer customer3 = new Company();

        //IoC Container
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();

    }
}

class CreditManager {
    public void calculate(int creditType) {

        if(creditType ==1) //esnaf
        {

        }
        if(creditType ==2) //ogretmen
        {

        }
        System.out.println("Hesaplandı");
    }

    public void save() {
        System.out.println("Kredi Verildi");
    }
}

interface ICreditManager
{
    void calculate();
    void save();
}

abstract class BaseCreditManager implements ICreditManager
{
    @Override
    public abstract void calculate();
    @Override
    public void save()
    {
        System.out.println("Kaydedildi");
    }
}
class TeacherCreditManager extends BaseCreditManager implements ICreditManager
{
    @Override
    public void calculate() {
       //hesaplamalar
        System.out.println("Öğretmen kredisi hesaplandı");
    }
}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager
{
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı");
    }
}
class CarCreditManager extends BaseCreditManager implements ICreditManager
{
    @Override
    public void calculate() {
        System.out.println("Araba kredisi hesaplandı");
    }
}
class Customer {
    public String firstName;

    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı");
    }
    public int id;
    public String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Person extends Customer {
    public String firstName;
    public String lastname;
    public String nationalIdentity;

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

class Company extends Customer {
    public String taxNumber;
    public String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}

class CustomerManager {
    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
      
    }

    public void save() {
        System.out.println("Müşteri Kaydedildi : ");
    }

    public void delete() {
        System.out.println("Müşteri Silindi : ");
    }
    public void giveCredit()
    {
       creditManager.calculate();
        System.out.println("Kredi Verildi");
    }
}