package anno_p.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = "anno_dress") //패키지 스캔
@ImportResource("annoXml/imClose.xml") //xml 적용
public class ClothScan {


}
