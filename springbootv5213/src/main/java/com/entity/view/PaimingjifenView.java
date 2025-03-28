package com.entity.view;

import com.entity.PaimingjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 排名计分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
@TableName("paimingjifen")
public class PaimingjifenView  extends PaimingjifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaimingjifenView(){
	}
 
 	public PaimingjifenView(PaimingjifenEntity paimingjifenEntity){
 	try {
			BeanUtils.copyProperties(this, paimingjifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
