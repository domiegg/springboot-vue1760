package com.dao;

import com.entity.BisaisaizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaisaizhiVO;
import com.entity.view.BisaisaizhiView;


/**
 * 比赛赛制
 * 
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface BisaisaizhiDao extends BaseMapper<BisaisaizhiEntity> {
	
	List<BisaisaizhiVO> selectListVO(@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);
	
	BisaisaizhiVO selectVO(@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);
	
	List<BisaisaizhiView> selectListView(@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);

	List<BisaisaizhiView> selectListView(Pagination page,@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);
	
	BisaisaizhiView selectView(@Param("ew") Wrapper<BisaisaizhiEntity> wrapper);
	

}
