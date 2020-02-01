package me.zhengjie.gen.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;
import me.zhengjie.annotation.Query;

/**
* @author Zheng Jie
* @date 2020-01-03
*/
@Data
public class GenTestQueryCriteria{

    /** 不为空 */
    @Query(type = Query.Type.NOT_NULL)
    private Integer sex;
    /** BETWEEN */
    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}