package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaileixingView;


/**
 * 比赛类型
 *
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface BisaileixingService extends IService<BisaileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaileixingVO> selectListVO(Wrapper<BisaileixingEntity> wrapper);
   	
   	BisaileixingVO selectVO(@Param("ew") Wrapper<BisaileixingEntity> wrapper);
   	
   	List<BisaileixingView> selectListView(Wrapper<BisaileixingEntity> wrapper);
   	
   	BisaileixingView selectView(@Param("ew") Wrapper<BisaileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaileixingEntity> wrapper);
   	

}

