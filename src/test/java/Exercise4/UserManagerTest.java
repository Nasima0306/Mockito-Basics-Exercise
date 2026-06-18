package Exercise4;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class UserManagerTest {
    @Test
    public void test(){
         LoggerService mocklogger=mock(LoggerService.class);
         doNothing().when(mocklogger).log(anyString());
         UserManager manager=new UserManager(mocklogger);
         manager.addUser();
         verify(mocklogger).log("User Added");
    }
}
