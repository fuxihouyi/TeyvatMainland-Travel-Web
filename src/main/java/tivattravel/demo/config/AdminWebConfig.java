package tivattravel.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tivattravel.demo.interceptor.LoginInterceptor;

/**
 * 1、编写一个拦截器实现HandlerInterceptor接口
 * 2、拦截器注册到容器中，（实现WebMvcConfigurer的addInterceptors）
 * 3、指定拦截器规则【如果是拦截所有，静态资源也会被拦截】
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//所有请求都被拦截包括静态资源
                .excludePathPatterns("/","/login","/regist**","/css/**","/font/**","/img/**","/js/**","/rank","/add");//放行静态资源
    }
}
