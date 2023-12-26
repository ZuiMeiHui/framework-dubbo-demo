package com.zuimeihui.demo.service.api;

import java.util.List;

import com.zuimeihui.demo.service.ApiResult;
import com.zuimeihui.demo.service.PageBean;
import com.zuimeihui.demo.service.dto.DemoUserDTO;
import com.zuimeihui.demo.service.dto.DemoUserQueryDTO;

/**
 * 用户表，接口层
 * 
 * @author 醉美会 ZuiMeiHui.com
 * @date 2023-11-12 20:29:00
 */
public interface IDemoUserService {

	/**
	 * 保存
	 * 
	 * @param dto
	 * @param userId
	 * @param userName
	 */
	public Long save(DemoUserDTO dto, String userId, String userName);

	/**
	 * 通过主键查询记录
	 * 
	 * @param id
	 * @return
	 */
	public DemoUserDTO get(Long id);

	/**
	 * 通过主键删除记录
	 * 
	 * @param id
	 */
	public void remove(Long id);

	/**
	 * 通过条件分页查询
	 * 
	 * @param queryDTO
	 * @return
	 */
	public PageBean<DemoUserDTO> selectPageBy(DemoUserQueryDTO queryDTO);

	/**
	 * 通过条件查询
	 * 
	 * @param queryDTO
	 * @return
	 */
	public List<DemoUserDTO> selectBy(DemoUserQueryDTO queryDTO);

	/**
	 * 通过条件获取但行记录
	 * 
	 * @param queryDTO
	 * @return
	 */
	public DemoUserDTO uniqueBy(DemoUserQueryDTO queryDTO);

	/**
	 * 新增数据参数校验
	 * 
	 * @param dto
	 * @return
	 */
	public ApiResult<?> checkSaveInput(DemoUserDTO dto);

	/**
	 * 删除数据参数校验
	 * 
	 * @param id
	 * @return
	 */
	public ApiResult<?> checkRemove(Long id);

}
