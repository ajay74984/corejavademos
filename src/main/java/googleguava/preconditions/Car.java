package googleguava.preconditions;

import com.google.common.base.MoreObjects;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

public class Car {

    private final Engine engine;
    private boolean isTurnedOn;

    public Car(Engine engine) {
        this.engine = checkNotNull(engine, "Engine should not be null");
        this.isTurnedOn = false;
    }

    public void turnOn(){
        checkState(!isTurnedOn, "Engine is already turned on!");
        isTurnedOn = true;
    }

    public void accerlateTo(int mph){
        engine.accerlateTo(mph);
    }

    public String toStrings(){
        return MoreObjects.toStringHelper(this)
                .add("Engine", engine)
                .add("IsTurnedOn", isTurnedOn)
                .toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
