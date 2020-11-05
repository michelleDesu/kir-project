package michelle.lexicon.se.KIR.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyHouseTest {

    private static List<FamilyHouseFamilyMemberLink> houseLink;
    private FamilyMember saga;
    private FamilyHouse helga;
    private FamilyHouse njora;

    @BeforeEach
    void setUp() {
        saga = createSaga();
        houseLink = new ArrayList<>();
        houseLink.add(
                new FamilyHouseFamilyMemberLink(
                        saga,
                        helga,
                        "primary",
                        "ätteldare"
                )
        );
        helga = new FamilyHouse(
                houseLink,
                "Berghem",
                "mjöd, spannmål",
                "Helgaätten är en realtivt stor ätt med en del värdshus",
                "festglada, värdshusfolk, bågskyttar",
                "En del bågskyttar, uthyrda hirdfolk till andra ätters hirder",
                5000

        );

        njora = new FamilyHouse(
                houseLink,
                "none",
                "handelsvaror",
                "Njoraätten är en främst utvandrad handelsätt",
                "handelsresande",
                "ingen",
                300

        );


    }

    private static FamilyMember createSaga() {

        FamilyMember object = new FamilyMember();
        object.setName("Saga");
        object.setFictiveMother("Helga");
        object.setFictiveFather("Rörek");
        object.setMemberBiography("Uppvuxen vid gubbkroken");
        object.setPersonalityTraits("God, sjunger, bågskytt");
        object.setJobTitle("Ätteledare");

        return object;
    }

    @Test
    void getFamilyHouseId() {
        int expected = 0;

        assertEquals(expected, helga.getFamilyHouseId());
    }

    @Test
    void getFamilyMembers() {
        List<FamilyHouseFamilyMemberLink> expected = houseLink;

        assertEquals(expected, helga.getFamilyMembers());
    }

    @Test
    void setFamilyMembers() {
        List<FamilyHouseFamilyMemberLink> expected = new ArrayList<>();
        expected.add(
                new FamilyHouseFamilyMemberLink(
                        saga,
                        helga,
                        "primary",
                        "ätteldare"
                )
        );

        expected.add(
                new FamilyHouseFamilyMemberLink(
                        saga,
                        njora,
                        "secondary",
                        "handelsdotter"
                )
        );




        helga.setFamilyMembers(expected);



        assertEquals(expected, helga.getFamilyMembers());
    }

    @Test
    void getHighSeat() {
        String expected = "Berghem";

        assertEquals(expected, helga.getHighSeat());
    }

    @Test
    void setHighSeat() {
        String expected = "inget i Hunaland";
        njora.setHighSeat(expected);
        assertEquals(expected, njora.getHighSeat());
    }

    @Test
    void getResources() {
        String expected = "mjöd, spannmål";
        assertEquals(expected, helga.getResources());
    }

    @Test
    void setResources() {
        String expected = "mjöd, spannmål, ull";
        helga.setResources(expected);
        assertEquals(expected, helga.getResources());
    }

    @Test
    void getDescription() {
        String expected = "Helgaätten är en realtivt stor ätt med en del värdshus";
        assertEquals(expected, helga.getDescription());
    }

    @Test
    void setDescription() {
        String expected = "Helgaätten är en realtivt stor ätt i Hunaland som äger en del värdshus";
        helga.setDescription(expected);
        assertEquals(expected, helga.getDescription());
    }

    @Test
    void getTypicalTraits() {
        String expected = "festglada, värdshusfolk, bågskyttar";
        assertEquals(expected, helga.getTypicalTraits());
    }

    @Test
    void setTypicalTraits() {
        String expected = "festglada, värdshusfolk, bågskyttar allmänt positiva";
        helga.setTypicalTraits(expected);
        assertEquals(expected, helga.getTypicalTraits());
    }

    @Test
    void getMilitaryForce() {
        String expected = "En del bågskyttar, uthyrda hirdfolk till andra ätters hirder";
        assertEquals(expected, helga.getMilitaryForce());
    }

    @Test
    void setMilitaryForce() {
        String expected = "En del bågskyttar, diverse hirdfolk";
        helga.setMilitaryForce(expected);
        assertEquals(expected, helga.getMilitaryForce());

    }

    @Test
    void getPopulation() {
        int expected = 5000;
        assertEquals(expected, helga.getPopulation());
    }

    @Test
    void setPopulation() {
        int expected = 6000;
        helga.setPopulation(expected);
        assertEquals(expected, helga.getPopulation());
    }

    @Test
    void equalsAndHashcode(){
        FamilyHouse test = helga;

        assertTrue(test.equals(helga) && helga.equals(test));
        assertEquals(test.hashCode(), helga.hashCode());
    }

    @Test
    void testToString() {
        String expected = "FamilyHouse{" + "familyHouseId=" + helga.getFamilyHouseId() +
                ", importantPersons=" + helga.getFamilyMembers().size() +
                ", highSeat='" + helga.getHighSeat() + '\'' +
                ", resources='" + helga.getResources() + '\'' +
                ", description='" + helga.getDescription() + '\'' +
                ", typicalTraits='" + helga.getTypicalTraits() + '\'' +
                ", militaryForce='" + helga.getMilitaryForce() + '\'' +
                ", population=" + helga.getPopulation() +
                '}';

        assertEquals(expected, helga.toString());
    }
}