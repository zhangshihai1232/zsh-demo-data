
public class TopologyMain {
	public static void main(String[] args) throws InterruptedException {
         
//        //Topology definition
//		TopologyBuilder builder = new TopologyBuilder();
//		builder.setSpout("word-reader",new WordReader());
//		builder.setBolt("word-normalizer", new WordNormalizer())
//			.shuffleGrouping("word-reader");
//		builder.setBolt("word-counter", new WordCounter(),1)
//			.fieldsGrouping("word-normalizer", new Fields("word"));
//
//        //Configuration
//		Config conf = new Config();
//		conf.put("wordsFile", args[0]);
//		conf.setDebug(false);
//        //Topology run
//		conf.put(Config.TOPOLOGY_MAX_SPOUT_PENDING, 1);
//		LocalCluster cluster = new LocalCluster();
//		cluster.submitTopology("Getting-Started-Toplogie", conf, builder.createTopology());
//		Thread.sleep(1000);
//		cluster.shutdown();
	}
}