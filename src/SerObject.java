import java.io.Serializable;
import java.util.ArrayList;

public class SerObject implements Serializable {
    public int num;
    public ArrayList<String> alist;
    private boolean bool;

    public SerObject(int num, String ch, boolean bool) {
        this.num = num;
        this.bool = bool;
        alist = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            String valami = ch;
            for(int j = 0; j < i; j++) {
                valami = valami + ch;
            }
            alist.add(valami);
        }
    }

    public boolean isBool() {
        return bool;
    }

    @Override
    public String toString() {
        return "SerObject{" +
                "num=" + num +
                ", alist=" + alist +
                ", bool=" + bool +
                '}';
    }
}
