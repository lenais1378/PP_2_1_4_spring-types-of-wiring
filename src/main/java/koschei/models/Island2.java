package koschei.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("wood3")
public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
