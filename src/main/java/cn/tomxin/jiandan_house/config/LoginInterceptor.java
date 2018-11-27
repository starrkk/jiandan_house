package cn.tomxin.jiandan_house.config;


import cn.tomxin.jiandan_house.util.JwtToken;
import com.auth0.jwt.interfaces.Claim;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class LoginInterceptor implements HandlerInterceptor {

//    public ThreadLocal<String> UserInfo = new ThreadLocal<String>();
    /**
     * 进入controller层之前拦截请求
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String access_token = httpServletRequest.getHeader("Authorization");

        if (access_token == null){
            throw new IllegalArgumentException("token不能为空");
        }
        //验证token
        Map<String, Claim>  claimMap = JwtToken.verifyToken(access_token);
//        UserInfo.set(claimMap.get("openId").asString());
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }

}
