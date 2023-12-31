package com.zuimeihui.demo.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.zuimeihui.demo.service.api.IDemoDepartmentService;
import com.zuimeihui.demo.service.base.BaseService;
import com.zuimeihui.demo.service.dao.db2.DemoDepartmentMapper;
import com.zuimeihui.demo.service.dto.DemoDepartmentDTO;
import com.zuimeihui.demo.service.dto.DemoDepartmentQueryDTO;

/**
 * 部门服务层
 * 
 * @ClassName: DemoDepartmentServiceImpl
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Service("demoDepartmentService")
public class DemoDepartmentServiceImpl extends BaseService<DemoDepartmentMapper, DemoDepartmentDTO, DemoDepartmentQueryDTO> implements IDemoDepartmentService {

	/**
	 * 保存和更新
	 */
	public Long save(DemoDepartmentDTO dto, String userId, String userName) {
		dto.setAdminId(userId);
		dto.setAdminName(userName);
		dto.setTimeUpdate(new Date());
		if (dto.getId() == null) {
			dto.setTimeCreate(new Date());
			dto.setFreeze(false);
			mapper.insertSelective(dto);
		} else {
			mapper.updateByPrimaryKeySelective(dto);
		}
		return dto.getId();
	}

}
