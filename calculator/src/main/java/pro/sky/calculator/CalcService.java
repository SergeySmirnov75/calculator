package pro.sky.calculator;

public interface CalcService
{
    String hello();
    String answerHello(String userName);
    String answerCalc();
    String plusCalc(int num1, int num2);
    String minusCalc(int num1, int num2);
    String multiplyCalc(int num1, int num2);
    public String divideCalc(int num1, int num2);
}
