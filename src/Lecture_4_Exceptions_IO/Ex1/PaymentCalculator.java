package Lecture_4_Exceptions_IO.Ex1;

public class PaymentCalculator {

    public int process(int nr){
        if(nr==0){
            throw new DivByZeroException();
        }
        return 5000/nr+300;
    }

    public int calculate(int numberOfHours){
        int result = 0;

        try {
            checkHours(numberOfHours);
        }
        catch (FewHoursException ex){
            System.out.println("Not enough hours exception occured.");
            numberOfHours = 31;
        }
        result = process(numberOfHours);
        return result;
    }

    private void checkHours(int numberOfHours) throws FewHoursException {
        if(numberOfHours < 30){
            throw new FewHoursException();
        }
    }
}
