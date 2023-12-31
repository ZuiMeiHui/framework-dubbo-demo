package com.zuimeihui.demo.service.dao.db2;

import org.apache.ibatis.annotations.Mapper;

import com.zuimeihui.demo.service.base.BaseMapper;
import com.zuimeihui.demo.service.dto.DemoDepartmentDTO;
import com.zuimeihui.demo.service.dto.DemoDepartmentQueryDTO;

/**
 * 部门表Mapper
 * 
 * @ClassName: DemoDepartmentMapper
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Mapper
public interface DemoDepartmentMapper extends BaseMapper<DemoDepartmentDTO, DemoDepartmentQueryDTO> {

}