package myportal.controller;

import myportal.service.GuestbookService;
import myportal.vo.GuestbookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
    @Autowired
    GuestbookService guestbookServiceImpl;

    @ResponseBody
    @RequestMapping({"", "/", "/list"})
    public String list() {
        List<GuestbookVo> list = guestbookServiceImpl.getMessageList();
        return list.toString();
    }
}
