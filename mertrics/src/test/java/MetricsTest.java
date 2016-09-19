import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Gauge;
import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import org.junit.Test;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by zsh on 2016/9/19.
 */
public class MetricsTest {
    private static final MetricRegistry metrics = new MetricRegistry();
    private static Queue<String> queue = new LinkedBlockingDeque<String>();
    private static ConsoleReporter reporter = ConsoleReporter.forRegistry(metrics).build();
    @Test
    public void TestGauges() throws InterruptedException {
        reporter.start(3, TimeUnit.SECONDS);
        //实例化一个Gauge
        Gauge<Integer> gauge = new Gauge<Integer>() {
            @Override
            public Integer getValue() {
                return queue.size();
            }
        };

        //注册到容器中
        metrics.register(MetricRegistry.name(MetricsTest.class, "pending-job", "size"), gauge);

        //测试JMX
//        JmxReporter jmxReporter = JmxReporter.forRegistry(metrics).build();
//        jmxReporter.start();
        //模拟数据
        for (int i=0; i<20; i++){
            queue.add("a");
            Thread.sleep(1000);
        }
    }
}
