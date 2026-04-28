public class ObjetTest {
    @Test
    public void testgetObjet(){
        Objet a = new Objet("Anto");
        assertEquals("Anto", a.getObjet());
    }
}
