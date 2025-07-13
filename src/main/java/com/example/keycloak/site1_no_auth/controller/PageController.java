package com.example.keycloak.site1_no_auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping(value = "/")
    public String goHome() {
        System.out.println("goHome()...");
        return "/home";
    }

    @GetMapping(value = "/admin/admin-test1")
    public String goAdminTest1() {
        System.out.println("goAdminTest1()...");
//        SecurityContext context = SecurityContextHolder.getContext();
//        Object object = context.getAuthentication();

        return "/admin/admin-test1";
    }

    @GetMapping(value = "/admin/admin-test2")
    public String goAdminTest2() {
        System.out.println("goAdminTest2()...");
        return "/admin/admin-test2";
    }

    @GetMapping(value = "/user/user-test1")
    public String goUserTest1() {
        System.out.println("goUserTest1()...");
        return "/user/user-test1";
    }

    @GetMapping(value = "/user/user-test2")
    public String goUserTest2() {
        System.out.println("goUserTest2()...");
        return "/user/user-test2";
    }

    @GetMapping(value = "/login")
    public String goLogin() {
        System.out.println("goLogin()...");
        return "/login/login";
    }

    @GetMapping(value = "/login_wmd")
    public String goLoginWMW() {
        System.out.println("goLogin_WMD()...");
        return "/login/login_wmd";
    }

    @GetMapping(value = "/login3")
    public String goLogin3() {
        System.out.println("goLogin(3)...");
        return "/login/login3";
    }

    @GetMapping(value = "/login_google")
    public String goLoginGoogle() {
        System.out.println("goLogin-google()...");
        return "/login/login_google";
    }

    @GetMapping(value = "/login_naver")
    public String goLoginNaver() {
        System.out.println("goLogin-naver()...");
        return "/login/login_naver";
    }

    @GetMapping(value = "/login_kakao")
    public String goLoginKakao() {
        System.out.println("goLogin-kakao()...");
        return "/login/login_kakao";
    }

}
