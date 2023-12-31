package com.zuimeihui.demo.service.api;

import java.util.List;

import com.zuimeihui.demo.service.ApiResult;
import com.zuimeihui.demo.service.PageBean;
import com.zuimeihui.demo.service.dto.DemoUserDTO;
import com.zuimeihui.demo.service.dto.DemoUserQueryDTO;

/**
 * 用户接口层
 * 
 * @ClassName: IDemoUserService
 * @Description: TODO
 * @author ZuiMeiHui.com 醉美会
 */
public interface IDemoUserService {

	/**
	 * 保存
	 * 
	 * @Title: save
	 * @Description: TODO
	 * @param @param  dto
	 * @param @param  userId
	 * @param @param  userName
	 * @param @return 参数
	 * @return Long 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public Long save(DemoUserDTO dto, String userId, String userName);

	/**
	 * 通过主键查询记录
	 * 
	 * @Title: get
	 * @Description: TODO
	 * @param @param  id
	 * @param @return 参数
	 * @return DemoUserDTO 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public DemoUserDTO get(Long id);

	/**
	 * 通过主键删除记录
	 * 
	 * @Title: remove
	 * @Description: TODO
	 * @param @param id 参数
	 * @return void 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public void remove(Long id);

	/**
	 * 通过条件分页查询
	 * 
	 * @Title: selectPageBy
	 * @Description: TODO
	 * @param @param  queryDTO
	 * @param @return 参数
	 * @return PageBean<DemoUserDTO> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public PageBean<DemoUserDTO> selectPageBy(DemoUserQueryDTO queryDTO);

	/**
	 * 通过条件查询
	 * 
	 * @Title: selectBy
	 * @Description: TODO
	 * @param @param  queryDTO
	 * @param @return 参数
	 * @return List<DemoUserDTO> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public List<DemoUserDTO> selectBy(DemoUserQueryDTO queryDTO);

	/**
	 * 通过条件获取一行记录
	 * 
	 * @Title: uniqueBy
	 * @Description: TODO
	 * @param @param  queryDTO
	 * @param @return 参数
	 * @return DemoUserDTO 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public DemoUserDTO uniqueBy(DemoUserQueryDTO queryDTO);

	/**
	 * 新增数据参数校验
	 * 
	 * @Title: checkSaveInput
	 * @Description: TODO
	 * @param @param  dto
	 * @param @return 参数
	 * @return ApiResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public ApiResult<?> checkSaveInput(DemoUserDTO dto);

	/**
	 * 删除数据参数校验
	 * 
	 * @Title: checkRemove
	 * @Description: TODO
	 * @param @param  id
	 * @param @return 参数
	 * @return ApiResult<?> 返回类型
	 * @throws
	 * @author ZuiMeiHui.com 醉美会
	 */
	public ApiResult<?> checkRemove(Long id);

}
