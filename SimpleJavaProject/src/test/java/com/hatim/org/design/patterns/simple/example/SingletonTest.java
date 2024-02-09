package com.hatim.org.design.patterns.simple.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SingletonTest {
	@Test
    public void testSingletonInstance() {
        // Récupérer l'instance unique du Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Vérifier si les deux instances sont identiques
        assertEquals(instance1, instance2, "Les instances doivent être identiques");
    }
}
