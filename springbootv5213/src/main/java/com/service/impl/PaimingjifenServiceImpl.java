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


import com.dao.PaimingjifenDao;
import com.entity.PaimingjifenEntity;
import com.service.PaimingjifenService;
import com.entity.vo.PaimingjifenVO;
import com.entity.view.PaimingjifenView;

@Service("paimingjifenService")
public class PaimingjifenServiceImpl extends ServiceImpl<PaimingjifenDao, PaimingjifenEntity> implements PaimingjifenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaimingjifenEntity> page = this.selectPage(
                new Query<PaimingjifenEntity>(params).getPage(),
                new EntityWrapper<PaimingjifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaimingjifenEntity> wrapper) {
		  Page<PaimingjifenView> page =new Query<PaimingjifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaimingjifenVO> selectListVO(Wrapper<PaimingjifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaimingjifenVO selectVO(Wrapper<PaimingjifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaimingjifenView> selectListView(Wrapper<PaimingjifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaimingjifenView selectView(Wrapper<PaimingjifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
