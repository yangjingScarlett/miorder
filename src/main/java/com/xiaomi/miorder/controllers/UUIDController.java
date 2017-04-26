/*
 * XiaoMi PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.xiaomi.miorder.controllers;

import com.xiaomi.miorder.model.ServerInfo;
import com.xiaomi.miorder.model.User;
import com.xiaomi.miorder.service.ServerCheckService;
import com.xiaomi.miorder.service.UUIDProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huangjia
 * @since 1.0
 */
@Controller
public class UUIDController {
    @Resource
    private UUIDProvider uuidProvider;

    @Autowired
    private ServerCheckService serverCheckService;

    @RequestMapping(value = "/test/uuid", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String get(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return uuidProvider.get();

    }

    @RequestMapping(value = "/test/user", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public User getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user=new User("huahua","male");
        return user;
    }

    @RequestMapping(value = "/test/server", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ServerInfo[] getServerInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //ServerInfo[] serverInfo={new ServerInfo("api","http://www.baidu.com"),new ServerInfo("service","http://www.weibo.com")};
        //return serverInfo;
        return serverCheckService.check();
    }
}
