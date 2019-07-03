import java.util.concurrent.TimeUnit;

/**
 * @author phh
 * @version V1.0
 * @date 2019/7/3
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Test test = new Test();
        test.test();
        TimeUnit.MILLISECONDS.sleep(50);
    }

    public void test() throws InterruptedException {
        System.out.println("agent test running.........");
        TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 100));
    }

}
