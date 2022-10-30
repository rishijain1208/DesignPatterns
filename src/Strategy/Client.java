package Strategy;

public class Client {

    public static void main(String[] args) {

        GoogleMaps obj = new GoogleMaps();
        obj.FindPath("Hisar","Gurgaon","Walk");
    }
}
