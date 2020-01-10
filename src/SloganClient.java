public class SloganClient {
    public static void main(String[] args) {
        Slogan s1 = new Slogan("Basketball");
        Slogan s2 = new Slogan("Soccer");
        Slogan s3 = new Slogan("Baseball");
        Slogan s4 = new Slogan("Football");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(Slogan.getCount());
    }
}
