package badcode;

        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class RegisterBusinessTest {

    @Test
    @DisplayName("Firstname ของ Speaker = null -> exception occurs")
    public void case01(){
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () ->
                registerBusiness.register(null, new Speaker()));
        assertEquals("First name is required.", exception.getMessage());
    }


    @Test
    @DisplayName("Lastname is null -> exception occurs")
    public void case02(){
        RegisterBusiness registerBusiness = new RegisterBusiness();
        Exception exception = assertThrows(ArgumentNullException.class, () ->
                registerBusiness.register(null, new Speaker()));
        assertEquals("First name is required.", exception.getMessage());
    }
}
}