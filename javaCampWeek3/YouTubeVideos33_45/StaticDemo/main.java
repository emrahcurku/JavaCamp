package YouTubeVideos33_45.StaticDemo;

 public class main {
    public static void main(String[] args) {

       ProductManager productManager = new ProductManager();
       Product product = new Product();
       product.price = 10;
       product.name="";

       productManager.add(product);

       DatabaseHelper.Connection.createConnection();


    }
}
