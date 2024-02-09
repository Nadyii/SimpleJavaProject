package com.hatim.org.design.patterns.simple.example;

public class Singleton {
	// Instance unique de la classe Singleton
    private static Singleton instance;

    // Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur de la classe
    private Singleton() {
    }

    // Méthode statique pour obtenir l'instance unique de Singleton
    public static Singleton getInstance() {
        // Créer une instance si elle n'existe pas déjà
        if (instance == null) {
            instance = new Singleton();
        }
        // Retourner l'instance unique
        return instance;
    }

    // Méthode d'exemple
    public void showMessage() {
        System.out.println("Hello, je suis un Singleton !");
    }
}
