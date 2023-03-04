import org.junit.jupiter.api.Test;

public class MainClass {
    public int getLocalNumber() {
        return 14;
    }
}

class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int result = mainClass.getLocalNumber();
        if(result != 14) {
            System.out.println("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }

}
