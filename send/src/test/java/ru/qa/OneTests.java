package ru.qa;

import org.testng.annotations.Test;
import ru.qa.send.Square;

public class OneTests {

    @Test

    public void testArea() {
        Square s = new Square(5);
assert s.Area() == 25;
    }
}
