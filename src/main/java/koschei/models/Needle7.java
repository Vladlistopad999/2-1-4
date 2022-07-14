package koschei.models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Needle7 {
    private Deth8 deth;
    @Override
    public String toString() {
        return "в яйце — игла, " + deth.toString();
    }
    @Autowired
    public void setDeth(Deth8 deth) {
        this.deth = deth; }
}