import java.util.Objects;


public class Main
{
    public static void main(String [] args) {
        int height, width;
        ascii cat = new ascii();
        SafeScanner sc = new SafeScanner(
                Objects.requireNonNull(SafeScanner.class.getResourceAsStream("demo.txt"))
        );
        int[] output = sc.getDimFromFile();
        height = output[0];
        width = output[1];
        cat.drawCat(height, width);
     sc.closescanner();
    }
}
