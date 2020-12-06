package abc;

import com.Dzieci;

public class ProtectedTest extends Dzieci{

    public static void main(String[] args) {
        Dzieci dzieci =
                new Dzieci("mieszkanie", "dom", 12);
        System.out.println(dzieci.iloscUbranek);
    }
}
