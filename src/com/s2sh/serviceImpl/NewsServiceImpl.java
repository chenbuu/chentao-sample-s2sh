package com.s2sh.serviceImpl;

import org.springframework.stereotype.Service;

import com.s2sh.model.News;
import com.s2sh.service.NewsService;

/**
 * 
 * @author ChenTao
 * @date 2015年05月29日下午9:43:37
 */
@Service("newsService")
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {

}