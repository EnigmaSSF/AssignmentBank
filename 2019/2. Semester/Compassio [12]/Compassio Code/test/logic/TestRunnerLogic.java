package logic;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Runs all the tests pertaining to the logic layer.
 *
 * @author Bent Wilhelmsen
 */
public class TestRunnerLogic {

    /**
     * Class main method executes the tests.
     *
     * @param args does nothing
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(LogicSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
