package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	/** 通用的页面跳转方法
	 * 例如:访问路径为 "/index"，则方法最后返回的值为："index"
	 * 即最终返回 /WEB-INF/pages/index.jsp
	 */
	@RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
}