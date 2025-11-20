package org.ldv.creasters.service

import org.ldv.creasters.model.dao.DAOEspeceMonstre
import org.ldv.creasters.model.dao.DAOIndividuMonstre
import org.ldv.creasters.model.dao.DAOItem
import org.ldv.creasters.model.dao.DAOZone
import org.ldv.creasters.model.entity.EspeceMonstre
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataInitializer(
    private val DAOEspeceMonstre: DAOEspeceMonstre,
    private val DAOIndividuMonstre: DAOIndividuMonstre,
    private val DAOZone: DAOZone,
    private val DAOItem: DAOItem,
) : CommandLineRunner {

    override fun run(vararg args: String?) {

        // Vérifie si la base contient déjà des données
        if (DAOEspeceMonstre.count() > 0 || DAOIndividuMonstre.count() > 0 || DAOZone.count() > 0 || DAOItem.count() > 0) {
            println("ℹ️ Données déjà présentes, initialisation ignorée.")
            return
        }

        println("🚀 Initialisation des données...")

        // === Catégories ===
        val scorpide= EspeceMonstre(

            nom = "scorpide",
            type = "insecte/poison",
            basePv = 13,
            baseAttaque = 6,
            baseDefense= 9,
            baseAttaqueSp = 10,
            baseDefenseSp= 10,
            baseVitesse= 13,
            modAttaque= 6.1,
            modDefense= 5.0,
            modVitesse= 2.0,
            modAttaqueSp= 9.0,
            modDefenseSp= 6.0,
            modPv= 16.0,
            description= "Creature du desert au corp de scorpion et au cou de serpent il se cache dans le sable et chasse en meute.",
            particularites= "la carapace des scorpides est assez épaisse pour maintenir leur température interne froide et possède une tres grande resistance",
            caracteres= "",
            cheminImageFace = "",
            cheminImageDos = ""
        )

        val Dracosteel = EspeceMonstre(

            nom = "Dracosteel",
            type = "Dragon/Acier",
            basePv = 9,
            baseAttaque = 7,
            baseDefense= 5,
            baseAttaqueSp = 16,
            baseDefenseSp= 5,
            baseVitesse= 12,
            modAttaque= 9.0,
            modDefense= 8.0,
            modVitesse= 15.0,
            modAttaqueSp= 19.0,
            modDefenseSp= 8.0,
            modPv= 12.0,
            description= "Un petit dragon en acier qui a un souffle qui peut faire un bang sonore et faire fondre n'importe quel matière.",
            particularites= "",
            caracteres= "",
            cheminImageFace = "",
            cheminImageDos = ""
        )
        val catJouet = Categorie(nom = "Jouets")
        val catMaison = Categorie(nom = "Maison")

        categorieDAO.saveAll(listOf(catGadget, catJouet, catMaison))

        // === Articles ===

        val articleMontre = Article(
            nom = "Montre connectée",
            description = "Montre connectée avec capteur de fréquence cardiaque et suivi d’activité.",
            stock = 20,
            prix = 79.99,
            lienImage = "https://example.com/images/montre-connectee.jpg",
            categorie = catGadget
        )

        val articleDrone = Article(
            nom = "Mini drone",
            description = "Drone compact avec caméra HD et contrôle via smartphone.",
            stock = 15,
            prix = 149.99,
            lienImage = "https://example.com/images/mini-drone.jpg",
            categorie = catGadget
        )


        // === Sauvegarde des articles ===
        articleDAO.saveAll(
            listOf(
                articleMontre,
                articleDrone

            )
        )

        println("✅ Données initiales insérées : ${categorieDAO.count()} catégories, ${articleDAO.count()} articles.")
    }
}
