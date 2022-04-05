import java.util.HashMap;
import java.util.Map;

public class Main {
    Customer customer = new Customer();
    HashMap customers = new HashMap();



    public void main(String[] args){
        ICustomer customer1 = new Customer("20201920","Kingkill","Gruntivgs vej 8","Frderik9889@gmail.com");
        Map<String,Customer> customers = new HashMap();
        customers.put("Home", (Customer) customer1);


    }

}
