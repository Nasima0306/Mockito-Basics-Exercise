package Exercise6;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class DataProcessorTest {
    @Test
    void testInteractionOrder(){

        DatabaseService mockDatabase =
                mock(DatabaseService.class);

        DataProcessor processor =
                new DataProcessor(mockDatabase);

        processor.process();

        InOrder inOrder =
                inOrder(mockDatabase);

        inOrder.verify(mockDatabase)
                .connect();

        inOrder.verify(mockDatabase)
                .fetchData();

        inOrder.verify(mockDatabase)
                .disconnect();

    }
}
