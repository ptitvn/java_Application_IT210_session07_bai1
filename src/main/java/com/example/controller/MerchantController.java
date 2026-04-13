package com.example.controller;

import com.example.model.RestaurantProfile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MerchantController {

    @GetMapping("/")
    public String home(RestaurantProfile profile) {
        return "profile";
    }

    // Trang hiển thị form cập nhật
    @GetMapping("/merchant/profile")
    public String showProfileForm(RestaurantProfile profile) {
        return "profile";
    }

    // Xử lý submit form
    @PostMapping("/merchant/update-profile")
    public String updateProfile(RestaurantProfile profile) {
        System.out.println("Tên quán: " + profile.getName());
        System.out.println("SĐT: " + profile.getPhone());
        System.out.println("Active: " + profile.isActive());

        // TODO: gọi service lưu DB
        return "success";
    }
}
