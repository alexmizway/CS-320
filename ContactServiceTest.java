package Module3_AMizway;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {


    @Test
    public void testAdd() {
        ContactService cs = new ContactService();
        Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444", "22 Jump Drive");
        assertEquals(true, cs.addContact(test1));
    }

    @Test
    public void testDelete() {
        ContactService cs = new ContactService();

        Contact test1 = new Contact("1234567", "Jane", "Doe", "4444444444", "22 Jump Drive");
        Contact test2 = new Contact("7943196", "Alan", "Turing", "8752064285", "Roses Valley");
        Contact test3 = new Contact("5507859", "Erwin", "Schrödinger", "9215501793", "Land of Disney" );

        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        assertEquals(true, cs.deleteContact("1234567"));
        assertEquals(false, cs.deleteContact("1309404"));
        assertEquals(false, cs.deleteContact("1309403"));
    }

    @Test
    public void testUpdate() {
        ContactService cs = new ContactService();

        Contact test1 = new Contact("1234567", "Jane", "Doe", "4444444444", "22 Jump Drive");
        Contact test2 = new Contact("7943196", "Alan", "Turing", "8752064285", "Roses Valley");
        Contact test3 = new Contact("5507859", "Erwin", "Schrödinger", "9215501793", "Land of Disney");

        cs.addContact(test1);
        cs.addContact(test2);
        cs.addContact(test3);

        assertEquals(true, cs.updateContact("5507859", "ErwinFirst", "SchrödingerLast", "9215501793", "Land of Disney"));
        assertEquals(false, cs.updateContact("9752322", "ErwinFirst", "SchrödingerLast", "9215501793", "Land of Disney"));
    }

}