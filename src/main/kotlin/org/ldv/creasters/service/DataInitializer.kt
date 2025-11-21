package org.ldv.creasters.service

import org.ldv.creasters.model.dao.DAOEspeceMonstre
import org.ldv.creasters.model.dao.DAOIndividuMonstre
import org.ldv.creasters.model.dao.DAOItem
import org.ldv.creasters.model.dao.DAOZone
import org.ldv.creasters.model.entity.Admin
import org.ldv.creasters.model.entity.EspeceMonstre
import org.ldv.creasters.model.entity.IndividuMonstre
import org.ldv.creasters.model.entity.Joueur
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
//TODO finir la classe en enlevant les commentaires entre /* et */
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
        //Creasters Nael
        val scorpide = EspeceMonstre(

            nom = "Scorpide",
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
            particularites= "la carapace des scorpides est assez épaisse pour maintenir leur température interne froide et possède une tres grande resistance, le dimorphisme sexuelle est tres prononcer entre les males et les femelle celle ci son un peu plus grosse et ne possède pas de dard.",
            caracteres= "les Scorpides sont de nature calme et n'attaque pas vraiment les autres créature, mais pendant la saison des amours les femelle deviennent extremement territorial et violente avec toute creature.",
            cheminImageFace = "°o°",
            cheminImageDos = "-_-"
        )

        val behemothprimaris = EspeceMonstre(

            nom = "Behemoth Primaris",
            type = "Cosmic",
            basePv = 5,
            baseAttaque = 5,
            baseDefense= 5,
            baseAttaqueSp = 5,
            baseDefenseSp= 5,
            baseVitesse= 5,
            modAttaque= 11.0,
            modDefense= 11.0,
            modVitesse= 11.0,
            modAttaqueSp= 11.0,
            modDefenseSp= 11.0,
            modPv= 11.0,
            description= "des êtres aussi vieux que l'univers lui meme a la puissance transcendant la nature il son au nombre de 3",
            particularites= "chacun des trois behemoth possède une apparence unique ",
            caracteres= "Error information introuvable",
            cheminImageFace = "°o°",
            cheminImageDos = "-_-"
        )

        //Creasters Fanis
        val Dragofire = EspeceMonstre(

            nom = "Dragofire",
            type = "Dragon/Feu",
            basePv = 9,
            baseAttaque = 7,
            baseDefense= 5,
            baseAttaqueSp = 16,
            baseDefenseSp= 5,
            baseVitesse= 10,
            modAttaque= 9.0,
            modDefense= 8.0,
            modVitesse= 15.0,
            modAttaqueSp= 19.0,
            modDefenseSp= 8.0,
            modPv= 12.0,
            description= "Une créature rouge qui peut utiliser du plasma.",
            particularites= "Les écailles du Dragon sont très resistantes et peuvent resister a de forte chaleur. Il a de grandes ailes et des petites ailes au bout de sa queue.",
            caracteres= "Il n'attaque que lorsqu'il se sens en danger ou lorsqu'il se fait attaquer pour riposter.",
            cheminImageFace = "°o°",
            cheminImageDos = "-_-"
        )

        //TODO finir ça
        /*val admin = Admin(
            id = null,
            nom = "Super",
            prenom = "Admin",
            email = "admin@admin.com",
            mdp = passwordEncoder.encode("admin123"), // mot de passe hashé
            role = roleAdmin
        )

        val joueur = Joueur(
            id = null,
            nom = "Lambda",
            prenom = "Joueur",
            email = "joueur@joueur.com",
            mdp = passwordEncoder.encode("joueur123"), // mot de passe hashé
            role = roleJoueur
        )

        DAOJoueur.saveAll(listOf(admin, joueur))*/
        /*val catJouet = Categorie(nom = "Jouets")
        val catMaison = Categorie(nom = "Maison")

        categorieDAO.saveAll (listOf (catGadget, catJouet, catMaison))

         === Articles ===
        val monstreScorpide = IndividuMonstre(1, "Scorpide", scorpide, 1800, 1500.0)

        val articleDrone = Article(
            nom = "Mini drone",
            description = "Drone compact avec caméra HD et contrôle via smartphone.",
            stock = 15,
            prix = 149.99,
            lienImage = "https://example.com/images/mini-drone.jpg",
            categorie = catGadget
        )


        // === Sauvegarde des articles ===
       val Melun = Zone(1, "Melun", "Zone de combat des Meluns")


        println("✅ Données initiales insérées : $")*/
    }
}
