package wyzwanie.tddkata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void should_return_zero_for_empty_string() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(0));
    }


    @Test
    public void should_return_five_for_string_5() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String five = "5";

        //when
        Integer result = calculatorUnderTest.add(five);

        //then
        assertThat(result, equalTo(5));
    }

    @Test
    public void should_return_twenty_for_string_20() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String twenty = "20";

        //when
        Integer result = calculatorUnderTest.add(twenty);

        //then
        assertThat(result, equalTo(20));
    }

    @Test
    public void should_not_return_zero_for_string_6() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String six = "6";

        //when
        Integer result = calculatorUnderTest.add(six);

        //then
        assertThat(result, not(0));
    }

    @Test
    public void should_return_eleven_for_string_8_comma_3() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String eightCommaThree = "8,3";

        //when
        Integer result = calculatorUnderTest.add(eightCommaThree);

        //then
        assertThat(result, equalTo(11));
    }

    @Test
    public void should_return_fifty_eight_for_string_37_comma_21() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String thirtySevenCommaTwentyOne = "37,21";

        //when
        Integer result = calculatorUnderTest.add(thirtySevenCommaTwentyOne);

        //then
        assertThat(result, equalTo(58));
    }

    @Test
    public void should_not_return_zero_for_string_4_comma_5() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String fourCommaFive = "4,5";

        //when
        Integer result = calculatorUnderTest.add(fourCommaFive);

        //then
        assertThat(result, not(0));
    }




    @Test
    public void should_return_zero_for_null_input() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = null;

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(0));
    }

    @Test
    public void should_not_return_five_for_string_five() {
        // TODO: Need consulting about the output
        //given
        Calculator calculatorUnderTest = new Calculator();
        String fiveString = "five";

        //when
        Integer result = calculatorUnderTest.add(fiveString);

        //then
        assertThat(result, not(5));
    }

    @Test
    public void should_ignore_non_numbers_and_sum_rest() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "a,3";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(3));
    }

    @Test(expected = Exception.class)
    public void should_return_error_when_no_comma_as_delimeter() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "1;3";

        //when
        Integer result = calculatorUnderTest.add(input);
    }

    @Test
    public void should_return_three_for_comma_at_end() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String threeComma = "3,";

        //when
        Integer result = calculatorUnderTest.add(threeComma);

        //then
        assertThat(result, equalTo(3));
    }

    @Test
    public void should_sum_all_numbers() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String multipleInput = "2,3,4";

        //when
        Integer result = calculatorUnderTest.add(multipleInput);

        //then
        assertThat(result, equalTo(9));
    }

}