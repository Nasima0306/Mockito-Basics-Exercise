package Exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    @Test
    void testMultipleReturns(){

        ExternalApi mockApi =
                mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Data 1",
                        "Data 2",
                        "Data 3");

        MyService service =
                new MyService(mockApi);

        assertEquals(
                "Data 1",
                service.fetchData()
        );

        assertEquals(
                "Data 2",
                service.fetchData()
        );

        assertEquals(
                "Data 3",
                service.fetchData()
        );

    }
}
