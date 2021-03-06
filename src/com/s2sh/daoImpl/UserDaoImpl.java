/**
 * 
 */
package com.s2sh.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.s2sh.dao.UserDao;
import com.s2sh.model.User;

/**
 * 
 * @author ChenTao
 * @date 2014年10月8日下午4:28:34
 */
@Transactional
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(UserDao.class);

	public UserDaoImpl() {
		super(User.class);
	}

}
