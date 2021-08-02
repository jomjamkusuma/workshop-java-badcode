package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterFeeTest {

    @ParameterizedTest
    @CsvSource({
            "0,500",
            "1,500",
            "2,250",
            "3,250",
            "4,100",
            "5,100",
            "9,50",
            "10,0",
    })
    public void getFeeWithDataTable(int experience, int expectedFee) {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        assertEquals(expectedFee, registerBusiness.getFee(experience));
    }


}