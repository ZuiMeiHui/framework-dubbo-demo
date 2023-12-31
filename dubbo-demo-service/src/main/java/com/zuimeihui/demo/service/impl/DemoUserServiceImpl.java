package com.zuimeihui.demo.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.zuimeihui.demo.service.api.IDemoUserService;
import com.zuimeihui.demo.service.base.BaseService;
import com.zuimeihui.demo.service.dao.db1.DemoUserMapper;
import com.zuimeihui.demo.service.dto.DemoUserDTO;
import com.zuimeihui.demo.service.dto.DemoUserQueryDTO;

/**
 * 用户服务层
 * 
 * @ClassName: DemoUserServiceImpl
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
@Service("demoUserService")
public class DemoUserServiceImpl extends BaseService<DemoUserMapper, DemoUserDTO, DemoUserQueryDTO> implements IDemoUserService {

	/**
	 * 保存和更新
	 */
	public Long save(DemoUserDTO dto, String userId, String userName) {
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
