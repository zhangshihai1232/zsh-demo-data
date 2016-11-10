package functions;

import com.google.common.base.Function;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zsh on 16.11.2.
        */
class DateFormatFunction implements Function<Date, String> {
    @Override
    public String apply(Date input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return dateFormat.format(input);
    }
}

class IntToStringFunction implements Function<Integer,String> {

    @Override
    public String apply(Integer input) {
        return "ret:"+input.toString();
    }
}

public class Main {
    @Test
    public void functionTest() {
        System.out.println(new IntToStringFunction().apply(10));
    }
}
