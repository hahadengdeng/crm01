package crm.Instraction;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mav=new ModelAndView();

        if (e instanceof AuthorizationException){
            mav.addObject("msg","权限不足");
        }else {
            mav.addObject("msg","未知异常");
        }

        mav.setViewName("login.jsp");
        return mav;
    }
}
