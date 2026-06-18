package Exercise7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class PaymentProcessorTest {
    @Test
    void testVoidMethodException(){

        PaymentService mockService =
                mock(PaymentService.class);

        doThrow(
                new RuntimeException(
                        "Payment Failed"
                )
        )
                .when(mockService)
                .processPayment();

        PaymentProcessor processor =
                new PaymentProcessor(mockService);

        assertThrows(
                RuntimeException.class,
                processor::makePayment
        );

        verify(mockService)
                .processPayment();

    }
}
