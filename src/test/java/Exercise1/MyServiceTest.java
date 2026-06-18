package Exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void Test(){
        ExternalApi mockApi=mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service=new MyService(mockApi);
        String result=service.fetchData();
        assertEquals("Mock Data",result);


    }
    @Test
    public void testinteractions(){
       ExternalApi mockApi=mock(ExternalApi.class);
       when(mockApi.getData()).thenReturn("Mock Data");
       MyService service=new MyService(mockApi);
       service.fetchData();
       verify(mockApi).getData();

    }
}
