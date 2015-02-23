package com.ppc.config;

import com.ppc.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * Created by lucasmorano on 2/21/15.
 */
@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoginUserService loginUserService;

    @Autowired
    private AuthenticationSuccessHandler authSuccessHandler;

    @Autowired
    private AuthenticationEntry authenticationEntry;

    @Autowired
    private AuthenticationSuccessHandler authenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/api/**").authenticated();
        http.exceptionHandling().authenticationEntryPoint(authenticationEntry);
        http.formLogin().successHandler(authenticationSuccessHandler);
        http.formLogin().failureHandler(authenticationFailureHandler);
        http.csrf().disable();
//        http.authorizeRequests()
//                .antMatchers("/", "/home", "/User/Register").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .successHandler(authSuccessHandler)
//                .permitAll()
//                .and()
//                .logout()
//                .deleteCookies("remember-me")
//                .permitAll()
//                .and()
//                .rememberMe()
//                .and()
//                .formLogin()
//                .passwordParameter("password")
//                .usernameParameter("username")
//                .loginPage("/login")
//                .failureUrl("/login?error")
//                .defaultSuccessUrl("/home");
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(loginUserService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}
