import java.util.ArrayList;

public class ThemePark {
        private String name;
        private ArrayList<Ride> rides;
        private ArrayList<Customer> customers;


        public ThemePark(String name) {
            this.name = name;
            this.rides = new ArrayList<>();
            this.customers = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int ridesCount() {
            return rides.size();
        }

        public int customerCount(){
            return customers.size();
        }

        public void addRide(Ride ride){
            rides.add(ride);
        }

    public void addCustomer(Customer customer) {
            customers.add(customer);
    }
}

