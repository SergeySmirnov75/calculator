package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
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


    @RequestMapping(path = "/")
    public String answerCalc()
    {
        return "Добро пожаловать в калькулятор!";
    }


    @RequestMapping(path = "/plus")
    public String plusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        return calcService.plusCalc(num1, num2);
    }

    @RequestMapping(path = "/minus")
    public String minusCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        return calcService.minusCalc(num1, num2);
    }

    @RequestMapping(path = "/multiply")
    public String multiplyCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        return calcService.multiplyCalc(num1, num2);
    }

    @RequestMapping(path = "/divide")
    public String divideCalc(@RequestParam("num1") int num1, @RequestParam("num2") int num2)
    {
        return calcService.divideCalc(num1, num2);
    }
}
