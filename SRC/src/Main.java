import java.util.HashMap;
import java.util.Map;

public class Main {




    public static void main(String[] args){
        ICustomer customer1 = new Customer("20201920","Kingkill","Gruntivgs vej 8","Frderik9889@gmail.com");
        Map<String, ICustomer> customers = new HashMap();
        customers.put("Home", customer1);

        System.out.println(customers);


    }

}
