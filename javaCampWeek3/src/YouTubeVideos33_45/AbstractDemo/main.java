package YouTubeVideos33_45.AbstractDemo;

 public class main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}
