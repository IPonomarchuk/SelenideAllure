import com.github.javafaker.Faker;

public class TestClass {


    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.chuckNorris().fact());
        System.out.println(faker.internet().emailAddress().replace("@","abc"));
        System.out.println(faker.name().firstName());


        System.out.println(faker.internet().password());

    }
}
