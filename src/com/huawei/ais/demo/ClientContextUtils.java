package com.huawei.ais.demo;

import com.huawei.ais.common.AuthInfo;
import com.huawei.ais.common.ProxyHostInfo;

/**
 * 此处为HTTP Client的工具函数，主要用于初始化Client的一些通用信息:
 * 
 * 包括 Endpoint(服务端点), Area(区域)，Access key(接入码) / Secret access key(安全接入码) 
 *
 */
public class ClientContextUtils {
	
	private static final AuthInfo HEC_AUTH = new AuthInfo(
			/*  OCR服务的服务端点, 该服务端口信息可以从如下地址查询
			 *  http://developer.huaweicloud.com/endpoint.html
			 * */
			"https://ais.cn-north-1.myhuaweicloud.com",
			"cn-north-1",  /* OCR服务的区域信息, 可以在上面的地址中查询 */
			 "N0WUSYXGXIYZVUXUJ1ME",    /* 请输入你的AK信息 */
			 "BCTtmfyFGIXj3ZOClAYPGs9ll7m5jnQLGRSWdAuK"     /* 对应AK的的SK信息 */
			 );
	
	public static AuthInfo getAuthInfo() {
		return HEC_AUTH;
	}

	/**
	 * 用于支持使用代理模式访问网络， 此时使用的代理主机配置信息
	 */
	public static ProxyHostInfo getProxyHost() {
		return new ProxyHostInfo("proxycn2.xxx.com", /* 代理主机信息 */
				8080,        /* 代理主机的端口 */
				"china/xxx", /* 代理的用户名 */
				"xxx"        /* 代理用户对应的密码 */
		);
	}
}
