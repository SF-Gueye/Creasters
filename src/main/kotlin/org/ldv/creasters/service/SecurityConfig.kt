package org.ldv.creasters.service

import org.ldv.creasters.model.dao.DAOJoueur
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer
//import org.springframework.security.config.annotation.web.configurers.DefaultLoginPageConfigurer
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableMethodSecurity
class SecurityConfig {

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()

    @Bean
    fun filterChain(http: HttpSecurity, daoJoueur: DAOJoueur): SecurityFilterChain {
        http
            //Restriction des endpoints en fonction du role
            .authorizeHttpRequests {
                it.requestMatchers("/Creasters", "/Creasters/register", "/Creasters/login", "/css/**", "/js/**", "/img/**", "/favicon.ico").permitAll()
                    // Autoriser l'accès pour les utilisateurs avec le rôle "ADMIN" à /admin/**
                    .requestMatchers("/Creasters/Admin/**").hasRole("ADMIN")
                    // Autoriser l'accès pour les utilisateurs avec le rôle "JOUEUR" à /Joueur/**
                    .requestMatchers("/Creasters/Joueur/**").hasRole("JOUEUR")
                    // Toutes les autres requêtes doivent être authentifiées
                    .anyRequest().authenticated()

            }
            // Configuration du formulaire de connexion
            .formLogin { form: FormLoginConfigurer<HttpSecurity?> ->
                form
                    .loginPage("/Creasters/login").defaultSuccessUrl("/Creasters/profil").failureUrl("/Creasters/login?error=true")
                    .loginProcessingUrl("/Creasters/login")
                    .permitAll()
            }

            // Configuration du mécanisme de déconnexion
            .logout { logout: LogoutConfigurer<HttpSecurity?> ->
                logout
                    .logoutUrl("/Creasters/logout")


                    .permitAll()
            }

        return http.build()
    }

    @Bean
    fun authenticationManager(config: AuthenticationConfiguration): AuthenticationManager {
        return config.authenticationManager
    }
}