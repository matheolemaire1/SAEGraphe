package fr.univorleans.iut45.SAEGraphe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PageTest {
    @Test
    public void testgetNumPage(){
        Page a = new Page(1, true, "bonjour", "Que dit un coq pour séduire une poule ?");
        assertEquals(1, a.getNum());
    }
}
