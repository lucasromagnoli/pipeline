package v2;

import java.util.UUID;

public class StageImpl implements Stage {
    @Override
    public String executar(String input) {
        return input + "[" + UUID.randomUUID().toString().charAt(0) + "]";
    }
}
