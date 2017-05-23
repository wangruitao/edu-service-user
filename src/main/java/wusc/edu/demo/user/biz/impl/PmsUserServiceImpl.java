package wusc.edu.demo.user.biz.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wucs.edu.facade.user.common.page.PageBean;
import wucs.edu.facade.user.common.page.PageParam;
import wucs.edu.facade.user.entity.PmsUser;
import wusc.edu.demo.user.biz.PmsUserService;
import wusc.edu.service.user.biz.PmsUserBiz;

@Service("pmsUserService")
public class PmsUserServiceImpl implements PmsUserService {

	@Autowired
	private PmsUserBiz pmsbiz;
	@Override
	public void create(PmsUser pmsUser) {
		pmsbiz.create(pmsUser);
	}

	@Override
	public PmsUser getById(Long userId) {
		return pmsbiz.getById(userId);
	}

	@Override
	public PmsUser findUserByUserNo(String userNo) {
		return pmsbiz.findUserByUserNo(userNo);
	}

	@Override
	public void deleteUserById(long userId) {
		pmsbiz.deleteUserById(userId);

	}

	@Override
	public void update(PmsUser user) {
		pmsbiz.update(user);

	}

	@Override
	public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
		pmsbiz.updateUserPwd(userId, newPwd, isTrue);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return pmsbiz.listPage(pageParam, paramMap);
	}

}
