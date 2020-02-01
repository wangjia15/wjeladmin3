package me.zhengjie.gen.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author Zheng Jie
* @date 2020-01-03
*/
@Data
public class GenTestDto implements Serializable {

    /** ID */
    private Integer id;

    /** 性别 */
    private Integer sex;

    private Timestamp createTime;
}