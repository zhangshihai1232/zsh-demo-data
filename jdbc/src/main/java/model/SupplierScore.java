package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by zsh on 2016/9/18.
*/
@ToString
@Getter
@Setter
public class SupplierScore {
    private String wrapper_id;
    private String supplier_name;
    private Integer score;
}
