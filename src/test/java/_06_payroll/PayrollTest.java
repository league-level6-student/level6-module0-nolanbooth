package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hourlyWage = 10.0;
    	int numHours = 10;
    	double expected = 100.0;
    	
    	double actual = payroll.calculatePaycheck(hourlyWage, numHours);
    	
    	assertEquals(expected,actual);
        //when

        //then
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int milesTraveled = 100;
    	double centspermile = .575;
    	
    	double expected = milesTraveled * centspermile;
        //when
    	double actual = payroll.calculateMileageReimbursement(milesTraveled);
    	
    	assertEquals(expected, actual);
    	
    	
        //then
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String employeeName = "noah";
    	double hourlyWage = 1.75;
    	
    	String expected = "Hello " + employeeName + ", We are pleased to offer you an hourly wage of " + hourlyWage;
    	
        //when
    	String actual = payroll.createOfferLetter(employeeName, hourlyWage);
        //then
    	assertEquals(expected, actual);
    	
    }

}