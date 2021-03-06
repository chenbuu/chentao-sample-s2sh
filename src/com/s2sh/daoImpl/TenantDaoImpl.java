/**
 * 
 */
package com.s2sh.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.s2sh.dao.TenantDao;
import com.s2sh.model.Tenant;

/**
 * 
 * @author ChenTao
 * @date 2014年10月8日下午4:28:34
 */
@Transactional
@Repository("tenantDao")
public class TenantDaoImpl extends BaseDaoImpl<Tenant> implements TenantDao {
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(TenantDao.class);

	public TenantDaoImpl() {
		super(Tenant.class);
	}

}
