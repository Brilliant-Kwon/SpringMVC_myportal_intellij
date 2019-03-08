package myportal.repository;

import myportal.vo.GuestbookVo;

import java.util.List;

public interface GuestbookDao {
    //EJB 권고사항 DAO의 메서드명은
    //실제 CRUD 작업을 위한 일반적인 이름을 따르도록 한다.
    //INSERT,SELECT,UPDATE,DELETE
    //selectByEmailAndPassword;
    public List<GuestbookVo> selectAll();
    public int insert(GuestbookVo vo);
    public int delete(GuestbookVo vo);
}
