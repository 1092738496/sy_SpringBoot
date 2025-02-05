package com.meditation.dao;

import com.meditation.pojo.press;
import org.apache.ibatis.annotations.Mapper;

/**
 * @time:
 * @description:
 */

@Mapper
public interface pressDao {
    //@Select("select * from press where id = #{id}")
    public press query_press(String id);
}
