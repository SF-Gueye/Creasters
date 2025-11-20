package org.ldv.creasters.model.entity

import jakarta.persistence.*
@Entity
@DiscriminatorValue("ADMIN")
class Admin(
    nom: String,
    mdp: String,

): Joueur(identifiant = nom, mdp = mdp )
{}