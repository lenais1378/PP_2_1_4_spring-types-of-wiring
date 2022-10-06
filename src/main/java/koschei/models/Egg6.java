package koschei.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("needle7")
public class Egg6 {
    private Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
