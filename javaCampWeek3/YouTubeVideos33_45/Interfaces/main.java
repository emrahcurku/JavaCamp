package YouTubeVideos33_45.Interfaces;

public class main {
    public static void main(String[] args) {

      CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
      customerManager.add();
    }
}
