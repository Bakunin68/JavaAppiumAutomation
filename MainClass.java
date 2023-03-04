import org.junit.jupiter.api.Test;

public class MainClass {
    private int class_number = 20;

    public int getClassNumber() {
        return class_number;
    }
}

class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int result = mainClass.getClassNumber();
        if(result > 45) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

}
