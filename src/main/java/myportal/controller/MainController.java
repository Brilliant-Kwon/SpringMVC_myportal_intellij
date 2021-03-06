package myportal.controller;

import myportal.exception.DaoException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping({"/", "/main"})
    public String main() {
        return "home";
    }

    //오류가 발생되는 메서드
    @ResponseBody
    @RequestMapping("/except")
    public String except() {
        try {
            int result = 4 / 0; //error
        } catch (Exception e) {
//            throw new RuntimeException("Main Controller Error");
            //예외의 전환
            throw new DaoException("메인 컨트롤러에서 DB오류");
        }
        return "<h1>Exception Test</h1>";
    }

    //Exception Handler
   /* @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String handleControllerExcept(RuntimeException e) {
        return "Exception: " + e.getMessage();
    }

    //Exception Handler v2
    @ExceptionHandler(DaoException.class)
    public ModelAndView handlerControllerExcept(DaoException e) {

        ModelAndView mav = new ModelAndView();
        mav.addObject("name", e.getClass().getSimpleName());
        mav.addObject("message", e.getMessage());
        mav.setViewName("exception/exception");
        return mav;
    }*/
}
