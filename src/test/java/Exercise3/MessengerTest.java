package Exercise3;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MessengerTest {
    @Test
    public void Test(){
       NotificationService Mockservice=mock(NotificationService.class);
       Messenger messenger=new Messenger(Mockservice);
       messenger.send();
       verify(Mockservice).sendMessage(anyString());
    }
}
