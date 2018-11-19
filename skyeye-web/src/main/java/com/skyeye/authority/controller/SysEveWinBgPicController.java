package com.skyeye.authority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.skyeye.authority.service.SysEveWinBgPicService;
import com.skyeye.common.object.InputObject;
import com.skyeye.common.object.OutputObject;

@Controller
public class SysEveWinBgPicController {
	
	@Autowired
	private SysEveWinBgPicService sysEveWinBgPicService;
	
	/**
	 * 
	     * @Title: querySysEveWinBgPicList
	     * @Description: 获取win系统桌面图片列表
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/querySysEveWinBgPicList")
	@ResponseBody
	public void querySysEveWinBgPicList(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.querySysEveWinBgPicList(inputObject, outputObject);
	}
	
	/**
	 * 
	     * @Title: insertSysEveWinBgPicMation
	     * @Description: 添加win系统桌面图片信息
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/insertSysEveWinBgPicMation")
	@ResponseBody
	public void insertSysEveWinBgPicMation(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.insertSysEveWinBgPicMation(inputObject, outputObject);
	}
	
	/**
	 * 
	     * @Title: deleteSysEveWinBgPicMationById
	     * @Description: 删除win系统桌面图片信息
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/deleteSysEveWinBgPicMationById")
	@ResponseBody
	public void deleteSysEveWinBgPicMationById(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.deleteSysEveWinBgPicMationById(inputObject, outputObject);
	}
	
	/**
	 * 
	     * @Title: querySysEveWinBgPicList
	     * @Description: 获取win系统桌面图片列表供展示
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/querySysEveWinBgPicListToShow")
	@ResponseBody
	public void querySysEveWinBgPicListToShow(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.querySysEveWinBgPicListToShow(inputObject, outputObject);
	}
	
	/**
	 * 
	     * @Title: insertSysEveWinBgPicMationByCustom
	     * @Description: 添加win系统桌面图片信息
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/insertSysEveWinBgPicMationByCustom")
	@ResponseBody
	public void insertSysEveWinBgPicMationByCustom(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.insertSysEveWinBgPicMationByCustom(inputObject, outputObject);
	}
	
	/**
	 * 
	     * @Title: querySysEveWinBgPicCustomList
	     * @Description: 获取win系统桌面图片列表用户自定义
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/querySysEveWinBgPicCustomList")
	@ResponseBody
	public void querySysEveWinBgPicCustomList(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.querySysEveWinBgPicCustomList(inputObject, outputObject);
	}
	
	/**
	 * 
	     * @Title: deleteSysEveWinBgPicMationById
	     * @Description: 删除win系统桌面图片信息用户自定义
	     * @param @param inputObject
	     * @param @param outputObject
	     * @param @throws Exception    参数
	     * @return void    返回类型
	     * @throws
	 */
	@RequestMapping("/post/SysEveWinBgPicController/deleteSysEveWinBgPicMationCustomById")
	@ResponseBody
	public void deleteSysEveWinBgPicMationCustomById(InputObject inputObject, OutputObject outputObject) throws Exception{
		sysEveWinBgPicService.deleteSysEveWinBgPicMationCustomById(inputObject, outputObject);
	}
	
}
