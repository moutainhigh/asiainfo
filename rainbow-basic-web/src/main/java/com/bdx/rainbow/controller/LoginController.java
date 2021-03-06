package com.bdx.rainbow.controller;

import com.bdx.rainbow.common.bean.ResultBean;
import com.bdx.rainbow.urs.dubbo.IDubUserService;
import com.bdx.rainbow.urs.entity.IUserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆
 * Created by fusj on 16/2/29.
 */
@Controller
@RequestMapping
public class LoginController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

//    @Autowired
    private IDubUserService dubUserService;
    /**
     * 系统首页
     *
     * @return
     */
    @RequestMapping(value = {"", "/", "login"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 登陆
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean login(String userName, String password, HttpServletRequest request) {

        try {
            Map<String, Object> sysLogon = new HashMap<String, Object>();

            IUserInfo sysUserInfo = dubUserService.login(userName, password, 1, sysLogon);

            request.getSession().setAttribute("sysUserInfo", sysUserInfo);

            ResultBean resultBean = new ResultBean(true);

            return resultBean;
        } catch(Exception ex) {
            return ajaxException(ex);
        }
    }

    /**
     * 退出
     * @param request
     * @return
     */
    @RequestMapping(value = "logout", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean logout(HttpServletRequest request) {
        try {

            request.getSession().removeAttribute("sysUserInfo");

            ResultBean resultBean = new ResultBean(true);

            return resultBean;
        } catch (Exception ex) {
            return ajaxException(ex);
        }
    }

}
