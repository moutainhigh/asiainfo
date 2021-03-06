/**
 * 
 */
package com.bdx.rainbow.mapp.core.exception;

/**
 * 错误编码定义
 * @author mler
 * @2016年4月7日
 */
public interface ErrorCodeDefine {
	
	/**处理成功 **/
	public static final String SUCCESS= "0000";//	正确
	
	/** 登陆超时 **/
	public static final String NO_USER_INFO= "0001";//	登陆超时
	
	/** 请求解析异常 **/
	public static final String UNRECOGNIZED_REQUEST="0002";//	请求解析异常
	
	/** 返回解析异常 **/
	public static final String UNRECOGNIZED_RESPONSE="0003";//	返回解析异常
	
	/** 未知错误 **/
	public static final String UNKNOW_ERROR="9999";//	未知错误
	
	/** 预料到的错误 **/
	public static final String EXPECT_ERROR="9998";//	预料到的错误
	
	/** 预料到的错误 **/
	public static final String SERVER_ERROR="8999";//	服务器到的错误
	

}
