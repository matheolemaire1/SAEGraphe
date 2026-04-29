package fr.univorleans.iut45.SAEGraphe;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ObjetTest {
    @Test
    public void testgetObjet(){
        Objet a = new Objet("Anto");
        assertEquals("Anto", a.getObjet());
    }
}
