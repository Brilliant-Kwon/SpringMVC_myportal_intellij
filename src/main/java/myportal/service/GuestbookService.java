package myportal.service;

import myportal.repository.GuestbookDao;
import myportal.vo.GuestbookVo;

import java.util.List;

public interface GuestbookService {
    public List<GuestbookVo> getMessageList();

    public boolean writeMessage(GuestbookVo vo);

    public boolean deleteMessage(GuestbookVo vo);
}
