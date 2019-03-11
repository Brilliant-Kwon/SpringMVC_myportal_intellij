package myportal.controller;

import myportal.service.GuestbookService;
import myportal.vo.GuestbookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
    @Autowired
    GuestbookService guestbookServiceImpl;

    //    @ResponseBody
    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model) {
        List<GuestbookVo> list = guestbookServiceImpl.getMessageList();
        model.addAttribute("list", list);

        return "guestbook/list";
//        return list.toString();
    }

    @RequestMapping(value = "/delete/{no}", method = RequestMethod.GET)
    public String deleteform(@PathVariable("no") Long no) {
        return "guestbook/deleteform";
    }
}
