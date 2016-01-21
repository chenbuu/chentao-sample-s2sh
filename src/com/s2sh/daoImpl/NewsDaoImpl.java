/**
 * 
 */
package com.s2sh.daoImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.s2sh.dao.NewsDao;
import com.s2sh.model.News;

/**
 * 
 * @author ChenTao
 * @date 2014年10月8日下午4:28:34
 */
@Transactional
@Repository("newsDao")
public class NewsDaoImpl extends BaseDaoImpl<News> implements NewsDao {
	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(NewsDao.class);

	public NewsDaoImpl() {
		super(News.class);
	}

}
