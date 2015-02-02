package client;

import org.example.contract.doubleit.DoubleItPortType;
import org.example.contract.doubleit.DoubleItService;

/**
 * Class WetherServiceTest.
 * This represents a Testclass.
 *
 * @author eicherst
 * @version $$Revision$$
 * @see <script>links('$$HeadURL$$');</script>
 */
public class DoubleItMainTest {

    public static void main(String[] args) {
        DoubleItService doubleItService = new DoubleItService();
        DoubleItPortType doubleItPort = doubleItService.getDoubleItPort();
        int i = doubleItPort.doubleIt(99);
        System.out.println(" Doubleit ist " + i);
    }

}
