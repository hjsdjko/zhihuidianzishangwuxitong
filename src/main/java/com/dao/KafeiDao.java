package com.dao;

import com.entity.KafeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KafeiView;

/**
 * 商品 Dao 接口
 *
 * @author 
 */
public interface KafeiDao extends BaseMapper<KafeiEntity> {

   List<KafeiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
