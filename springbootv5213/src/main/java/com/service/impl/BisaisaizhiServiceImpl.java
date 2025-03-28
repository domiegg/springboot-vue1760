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


import com.dao.BisaisaizhiDao;
import com.entity.BisaisaizhiEntity;
import com.service.BisaisaizhiService;
import com.entity.vo.BisaisaizhiVO;
import com.entity.view.BisaisaizhiView;

@Service("bisaisaizhiService")
public class BisaisaizhiServiceImpl extends ServiceImpl<BisaisaizhiDao, BisaisaizhiEntity> implements BisaisaizhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaisaizhiEntity> page = this.selectPage(
                new Query<BisaisaizhiEntity>(params).getPage(),
                new EntityWrapper<BisaisaizhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaisaizhiEntity> wrapper) {
		  Page<BisaisaizhiView> page =new Query<BisaisaizhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaisaizhiVO> selectListVO(Wrapper<BisaisaizhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaisaizhiVO selectVO(Wrapper<BisaisaizhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaisaizhiView> selectListView(Wrapper<BisaisaizhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaisaizhiView selectView(Wrapper<BisaisaizhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
