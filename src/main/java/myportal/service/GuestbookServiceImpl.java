package myportal.service;

import myportal.repository.GuestbookDao;
import myportal.vo.GuestbookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestbookServiceImpl implements GuestbookService {
    @Autowired
    GuestbookDao guestbookDaoImpl;

    @Override
    public List<GuestbookVo> getMessageList() {
        return guestbookDaoImpl.selectAll();
    }

    @Override
    public boolean writeMessage(GuestbookVo vo) {
        return false;
    }

    @Override
    public boolean deleteMessage(GuestbookVo vo) {
        return false;
    }
}
