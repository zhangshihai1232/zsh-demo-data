import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsh on 16.11.3.
 */
public class JCommanderExample {
    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    private String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = true;

    public static void main(String[] args) {
        JCommanderExample jct = new JCommanderExample();
        String[] argv = { "-log", "2"};
        new JCommander(jct, argv);

//        Assert.assertEquals(jct.verbose.intValue(), 2);
        System.out.println(jct.verbose);
        System.out.println(jct.groups);
        System.out.println(jct.debug);
    }
}
