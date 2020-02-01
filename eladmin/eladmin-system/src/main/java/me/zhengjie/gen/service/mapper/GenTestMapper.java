package me.zhengjie.gen.service.mapper;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.gen.domain.GenTest;
import me.zhengjie.gen.service.dto.GenTestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author Zheng Jie
* @date 2020-01-03
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GenTestMapper extends BaseMapper<GenTestDto, GenTest> {

}