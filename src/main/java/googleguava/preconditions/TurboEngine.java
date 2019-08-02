package googleguava.preconditions;

import static org.assertj.core.util.Preconditions.checkArgument;

public class TurboEngine implements Engine {

    private int speed;

    private final int MAX_SPEED = 70;

    @Override
    public void accerlateTo(int mph) {
        checkArgument(mph <= MAX_SPEED, "Max speed is reached");
    }
}
