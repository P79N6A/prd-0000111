package com.deepexi.tess.mapper;

import com.deepexi.tess.domain.eo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by donh on 2018/7/24.
 */
@Mapper
public interface ProductMapper {

    //使用xml的方式
    Product getById(Integer id);

}
