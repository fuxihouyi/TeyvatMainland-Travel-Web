package tivattravel.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scenery {
    private long sid;
    private String sname;
    private String introduction;
    private String subjection;
    private String path;
}
