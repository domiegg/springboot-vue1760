package com.entity.view;

import com.entity.BisaileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 比赛类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
@TableName("bisaileixing")
public class BisaileixingView  extends BisaileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BisaileixingView(){
	}
 
 	public BisaileixingView(BisaileixingEntity bisaileixingEntity){
 	try {
			BeanUtils.copyProperties(this, bisaileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
