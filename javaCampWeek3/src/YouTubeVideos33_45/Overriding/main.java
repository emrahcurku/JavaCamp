package YouTubeVideos33_45.Overriding;

public class main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
