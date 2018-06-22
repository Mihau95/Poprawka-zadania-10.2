import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {
        System.out.println("Gdzie chcesz isc?");
        Scanner scanner = new Scanner(System.in);
        String kierunek = scanner.nextLine();

        Direction nD = Direction.valueOf("NORTH");
            System.out.println("Idziesz na " + kierunek.nD);

    }
}
