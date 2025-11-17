package org.ldv.creasters.controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController (){

    /**
     * Méthode permettant d'afficher la page d'accueil de l'application.
     * @return le chemin vers le template a partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/Creasters")
    fun home():String{
        return "index"
    }

    @GetMapping("/a-propos")
    fun apropos():String{
        return "a-propos"
    }

    @GetMapping("/contact")
    fun contact():String{
        return "contact"
    }

    @GetMapping("/inscription")
    fun inscription():String{
        return "inscription"
    }

    @GetMapping("/produit")
    fun produit():String{
        return "produit"
    }

    @GetMapping("/rgpd")
    fun rgpd():String{
        return "rgpd"
    }
}
