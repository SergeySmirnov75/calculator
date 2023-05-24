package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImp implements CalcService
{

    public String hello()
    {
        return "hello";
    }


    public String answerHello(String userName)
    {
        return "<b>hello</b>" + userName;
    }

    public String answerCalc()
    {
        return "Добро пожаловать в калькулятор!";
    }

    public String plusCalc(int num1, int num2)
    {
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }

    public String minusCalc(int num1, int num2)
    {
        int res = num1 - num2;
        return num1 + " - " + num2 + " = " + res;
    }

    public String multiplyCalc(int num1, int num2)
    {
        int res = num1 * num2;
        return num1 + " * " + num2 + " = " + res;
    }

    public String divideCalc(int num1, int num2)
    {
        if (num2 != 0)
        {
            int res = num1 / num2;
            return num1 + " / " + num2 + " = " + res;
        }
        else return "нельзя делить на ноль";
    }
}
