package Chapter8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    Time time;
    @BeforeEach
    void beforeEach(){
        time=new Time();
    }
     @AfterEach
    void afterEach(){
        time=null;
     }
@Test
    void methodShouldBeAbleToCreateTime(){
        time.setTime(23);
        assertEquals(23,time.getHour());
}

}
