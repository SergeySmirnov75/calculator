package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController
{
    private final CalcService calcService;

    public CalcController(CalcService calcService)
    {
        this.calcService = calcService;
    }
    @GetMapping
    public String hello()
    {
        return "hello";
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName)
    {
        return "<b>hello</b>" + userName;
    }


    @RequestMapping(path = "/calculator")
    public String answerCalc()
    {
        return "Добро пожаловать в калькулятор!";
    }


    @RequestMapping(path = "/calculator/plus")
    public String plusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }

    @RequestMapping(path = "/calculator/minus")
    public String minusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        int res = num1 - num2;
        return num1 + " - " + num2 + " = " + res;
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiplyCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        int res = num1 * num2;
        return num1 + " * " + num2 + " = " + res;
    }

    @RequestMapping(path = "/calculator/divide")
    public String divideCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        if (num2 != 0)
        {
            int res = num1 / num2;
            return num1 + " / " + num2 + " = " + res;
        }
        else return "нельзя делить на ноль";
    }
}
