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


import com.dao.GuanzhongDao;
import com.entity.GuanzhongEntity;
import com.service.GuanzhongService;
import com.entity.vo.GuanzhongVO;
import com.entity.view.GuanzhongView;

@Service("guanzhongService")
public class GuanzhongServiceImpl extends ServiceImpl<GuanzhongDao, GuanzhongEntity> implements GuanzhongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanzhongEntity> page = this.selectPage(
                new Query<GuanzhongEntity>(params).getPage(),
                new EntityWrapper<GuanzhongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanzhongEntity> wrapper) {
		  Page<GuanzhongView> page =new Query<GuanzhongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanzhongVO> selectListVO(Wrapper<GuanzhongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanzhongVO selectVO(Wrapper<GuanzhongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanzhongView> selectListView(Wrapper<GuanzhongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanzhongView selectView(Wrapper<GuanzhongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
