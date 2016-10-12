/**
 * Created by zsh on 2016/10/12.
 */
public class KafkaProperties {
    final static String ubuntu_ip = "192.168.188.129";
    final static String zkConnect = ubuntu_ip+":2181";
    final static String groupId = "group1";
    final static String topic = "zsh-topic";
    final static String kafkaServerURL = ubuntu_ip;
    final static int kafkaServerPort = 9092;
    final static int kafkaProducerBufferSize = 64 * 1024;
    final static int connectionTimeOut = 20000;
    final static int reconnectInterval = 10000;
    final static String topic2 = "topic2";
    final static String topic3 = "topic3";
    final static String clientId = "SimpleConsumerDemoClient";
}
