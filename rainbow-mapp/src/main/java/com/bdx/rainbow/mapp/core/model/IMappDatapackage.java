/**
 * 
 */
package com.bdx.rainbow.mapp.core.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author yangqx
 * 
 * 增加setHeader 方法，在Mapp中内部调用接口时，生成新的请求包头时使用
 * @modify mler
 *
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface IMappDatapackage {

	public IHeader getHeader();

	public void setHeader(IHeader header);

	public IBody getBody();

	public void setBody(IBody body);
	
	
	
}
