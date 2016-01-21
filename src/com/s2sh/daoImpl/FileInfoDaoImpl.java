/**
 * 
 */
package com.s2sh.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.s2sh.dao.FileInfoDao;
import com.s2sh.model.FileInfo;

/**
 * 
 * @author ChenTao
 * @date 2014年10月8日下午4:28:34
 */
@Transactional
@Repository("fileInfoDao")
public class FileInfoDaoImpl extends BaseDaoImpl<FileInfo> implements FileInfoDao {
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(FileInfoDao.class);

	public FileInfoDaoImpl() {
		super(FileInfo.class);
	}

}
