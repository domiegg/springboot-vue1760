package com.dao;

import com.entity.BisaileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaileixingVO;
import com.entity.view.BisaileixingView;


/**
 * 比赛类型
 * 
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface BisaileixingDao extends BaseMapper<BisaileixingEntity> {
	
	List<BisaileixingVO> selectListVO(@Param("ew") Wrapper<BisaileixingEntity> wrapper);
	
	BisaileixingVO selectVO(@Param("ew") Wrapper<BisaileixingEntity> wrapper);
	
	List<BisaileixingView> selectListView(@Param("ew") Wrapper<BisaileixingEntity> wrapper);

	List<BisaileixingView> selectListView(Pagination page,@Param("ew") Wrapper<BisaileixingEntity> wrapper);
	
	BisaileixingView selectView(@Param("ew") Wrapper<BisaileixingEntity> wrapper);
	

}
