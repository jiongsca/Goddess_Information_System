package action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import model.Goddess;
import dao.GoddessDao;

/**
 * 
 * @author Administrator 控制层：接收来自视图层的请求并且调用模型层的方法实现目的
 */

public class GoddessAction {
	public void add(Goddess goddess) throws SQLException {
		GoddessDao dao = new GoddessDao();
		goddess.setSex(1);
		goddess.setCreate_user("ADMIN");
		goddess.setUpdate_user("ADMIN");
		goddess.setIsdel(0);
		dao.addGoddess(goddess);

	}

	public Goddess get(Integer id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		return dao.get(id);
	}

	public void edit(Goddess goddess) throws Exception {
		GoddessDao dao = new GoddessDao();
		dao.updateGoddess(goddess);
	}

	public void del(Integer id) throws SQLException {
		GoddessDao dao = new GoddessDao();
		dao.delGoddess(id);
	}

	public List<Goddess> query() throws Exception {
		GoddessDao dao = new GoddessDao();
		return dao.query();
	}

	public List<Goddess> query(List<Map<String, Object>> params)
			throws Exception {
		GoddessDao dao = new GoddessDao();
		return dao.query(params);
	}

}
