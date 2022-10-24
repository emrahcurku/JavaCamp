package YouTubeVideos33_45.Interfaces;

public class SqlServerCustomerDal implements CustomerDal{
    @Override
    public void add() {
        System.out.println("Sql server eklendi");
    }
}
