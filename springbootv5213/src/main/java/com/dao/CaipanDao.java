package com.dao;

import com.entity.CaipanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipanVO;
import com.entity.view.CaipanView;


/**
 * 裁判
 * 
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface CaipanDao extends BaseMapper<CaipanEntity> {
	
	List<CaipanVO> selectListVO(@Param("ew") Wrapper<CaipanEntity> wrapper);
	
	CaipanVO selectVO(@Param("ew") Wrapper<CaipanEntity> wrapper);
	
	List<CaipanView> selectListView(@Param("ew") Wrapper<CaipanEntity> wrapper);

	List<CaipanView> selectListView(Pagination page,@Param("ew") Wrapper<CaipanEntity> wrapper);
	
	CaipanView selectView(@Param("ew") Wrapper<CaipanEntity> wrapper);
	

}
