package edu.wcsu.thestore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Configuration
public class TStoreMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("index");

        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/error.html").setViewName("404");
        registry.addViewController("/404.html").setViewName("404");

        registry.addViewController("/register.html").setViewName("register");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/signup").setViewName("register");

        registry.addViewController("/cart.html").setViewName("cart");
        registry.addViewController("/cart").setViewName("cart");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/assets/**", "/favicon.ico", "/webjars/**")
                .excludePathPatterns("/index.html", "/index", "/main.html", "/main")
                .excludePathPatterns("/login", "/login.html")
                .excludePathPatterns("/register.html", "/register", "/signup")
                .excludePathPatterns("/details.html", "/details")
                .excludePathPatterns("/products.html", "/products", "/product", "/search")
                .excludePathPatterns("/error", "/error.html", "/404", "/404.html")
                .excludePathPatterns("/data", "/test");
    }
}
