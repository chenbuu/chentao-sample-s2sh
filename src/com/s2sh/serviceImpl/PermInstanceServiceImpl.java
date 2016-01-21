package com.s2sh.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.s2sh.model.PermInstance;
import com.s2sh.service.PermInstanceService;

/**
 * 
 * @author ChenTao
 * @date 2015年05月29日下午9:43:37
 */
@Service("permInstanceService")
public class PermInstanceServiceImpl extends BaseServiceImpl<PermInstance> implements PermInstanceService {

	@Override
	public List<Long> findByRoleId(Long roleId) {
		return this.permInstanceDao.findByRoleId(roleId);
	}

}