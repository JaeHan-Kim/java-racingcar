package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    private static final String ENTRY_CAR_NAME = "jae";

    private Car car;

    @BeforeEach
    void setUp() throws Exception {
        Name name = new Name(ENTRY_CAR_NAME);
        car = new Car(name);
    }

    @DisplayName("자동차가 전진 하는지 테스트")
    @Test
    void moveCar() {
        StateGenerator stateGenerator = () -> State.MOVE;
        Location expected = new Location(1);

        car.move(stateGenerator);

        assertThat(car.getLocation()).isEqualTo(expected);
    }

    @DisplayName("자동차가 정지해 있는지 테스트")
    @Test
    void stopCar() {
        StateGenerator stateGenerator = () -> State.STOP;
        Location expected = new Location();

        car.move(stateGenerator);

        assertThat(car.getLocation()).isEqualTo(expected);
    }
}
