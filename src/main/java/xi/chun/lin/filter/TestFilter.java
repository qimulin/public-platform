package xi.chun.lin.filter;

import org.springframework.stereotype.Component;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Lin.XiChun on 2018/6/26.
 */
//@Component
//@WebFilter(urlPatterns = "/Blogs",filterName = "blosTest")
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        System.out.println("过滤器doFilter");
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器destroy");
    }
}
