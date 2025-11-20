package org.ldv.creasters.controller.admincontrollers

import org.springframework.web.bind.annotation.GetMapping

class AdminController {
    @GetMapping("/Creasters/admin")
    fun home():String{
        return "index"
    }
}