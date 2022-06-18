package com.entity.view;

import com.entity.ChuzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-03 14:52:32
 */
@TableName("chuzhenxinxi")
public class ChuzhenxinxiView  extends ChuzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuzhenxinxiView(){
	}
 
 	public ChuzhenxinxiView(ChuzhenxinxiEntity chuzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chuzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}