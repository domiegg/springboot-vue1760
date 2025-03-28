package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BisaixuanshouDao;
import com.entity.BisaixuanshouEntity;
import com.service.BisaixuanshouService;
import com.entity.vo.BisaixuanshouVO;
import com.entity.view.BisaixuanshouView;

@Service("bisaixuanshouService")
public class BisaixuanshouServiceImpl extends ServiceImpl<BisaixuanshouDao, BisaixuanshouEntity> implements BisaixuanshouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaixuanshouEntity> page = this.selectPage(
                new Query<BisaixuanshouEntity>(params).getPage(),
                new EntityWrapper<BisaixuanshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaixuanshouEntity> wrapper) {
		  Page<BisaixuanshouView> page =new Query<BisaixuanshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaixuanshouVO> selectListVO(Wrapper<BisaixuanshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaixuanshouVO selectVO(Wrapper<BisaixuanshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaixuanshouView> selectListView(Wrapper<BisaixuanshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaixuanshouView selectView(Wrapper<BisaixuanshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
