package com.example.demo.config;
import java.io.IOException;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
@WebFilter(urlPatterns="/*")
public class AccessFilter extends HttpServlet implements Filter{
    
    private static final long serialVersionUID = 1L;
    
    @Value("localhost")
    private String projectDemoAllowOriginUrl;
 
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {               
    }
 
    //设置其他IP地址的机器可以直接访问到这个项目的后端
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Origin", projectDemoAllowOriginUrl);
        httpResponse.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, httpResponse);
                
    }
 
}