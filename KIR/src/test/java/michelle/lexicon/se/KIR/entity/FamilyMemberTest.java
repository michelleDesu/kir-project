package michelle.lexicon.se.KIR.entity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    private static FamilyMember saga;
    private static FamilyMember embla;
    private static FamilyHouse  helga;
    private static List<FamilyHouseFamilyMemberLink> houseLink;
    private static List<FamilyMemberFamilyMemberLink> children;


    @BeforeEach
    void setUp() {

        saga = new FamilyMember();
        embla = new FamilyMember();

        saga = createSaga();
        embla = createEmbla();

        helga = new FamilyHouse(
                null,
                "Berghem",
                "mjöd, spannmål",
                "Helgaätten är en realtivt stor ätt med en del värdshus",
                "festglada, värdshusfolk, bågskyttar",
                "En del bågskyttar, uthyrda hirdfolk till andra ätters hirder",
                5000

        );


        houseLink = new ArrayList<>();
        houseLink.add(
                new FamilyHouseFamilyMemberLink(
                     saga,
                        helga,
                        "primary",
                        "ätteldare"
                )
        );
        houseLink.add(
                new FamilyHouseFamilyMemberLink(
                     embla,
                        helga,
                        "primary",
                        "barn"
                )
        );


        children = new ArrayList<>();
        children.add(
                new FamilyMemberFamilyMemberLink(
                        saga,
                        embla,
                        "child"
                )
        );



        saga.setHouseMemberLinkList(houseLink);
        saga.setFamilyMemberLinkList(children);

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

    private static FamilyMember createEmbla() {

        FamilyMember object = new FamilyMember();
        object.setName("Embla");
        object.setMother(saga);
        object.setFictiveFather("Styv");
        object.setMemberBiography("Uppvuxen i Berghem och på Västanbäcken");
        object.setPersonalityTraits("glad, livlig");
        object.setJobTitle("dotter till ätteledare");

        return object;
    }

    @Test
    void getFamilyId() {
        int expected = 0;
        assertEquals(expected, saga.getFamilyId());
    }

    @Test
    void getFamilyImage() {
        assertNull(saga.getFamilyImage());
    }

    @Test
    void setFamilyImage() {
        String expected = "Saga";
        saga.setFamilyImage(expected);
        assertEquals(expected, saga.getFamilyImage());
    }

    @Test
    void getMother() {
        assertNull(saga.getMother());
    }

    @Test
    void setMother() {
        FamilyMember expected = embla;
        saga.setMother(expected);
        assertEquals(expected, saga.getMother());

    }

    @Test
    void getFather() {
        assertNull(saga.getFather());
    }

    @Test
    void setFather() {
        FamilyMember expected = embla;
        saga.setFather(expected);
        assertEquals(expected, saga.getFather());
    }

    @Test
    void getFictiveMother() {
        String expected = "Helga";
        assertEquals(expected, saga.getFictiveMother());
    }

    @Test
    void setFictiveMother() {
        String expected = "Test";
        saga.setFictiveMother(expected);
        assertEquals(expected, saga.getFictiveMother());
    }

    @Test
    void getFictiveFather() {
        String expected = "Rörek";
        assertEquals(expected, saga.getFictiveFather());
    }

    @Test
    void setFictiveFather() {
        String expected = "Test";
        saga.setFictiveFather(expected);
        assertEquals(expected, saga.getFictiveFather());
    }

    @Test
    void getFamilyMemberLinkList() {
        List<FamilyMemberFamilyMemberLink> expected = children;

        assertEquals(expected, saga.getFamilyMemberLinkList());
    }

    @Test
    void setFamilyMemberLinkList() {
        List<FamilyMemberFamilyMemberLink> expected = new ArrayList<>();
        expected.add(
                new FamilyMemberFamilyMemberLink(
                        saga,
                        embla,
                        "child"
                )
        );
        expected.add(
                new FamilyMemberFamilyMemberLink(
                        embla,
                        saga,
                        "mother"
                )
        );

        children.add(
                new FamilyMemberFamilyMemberLink(
                        embla,
                        saga,
                        "mother"
                )
        );

        assertEquals(expected, saga.getFamilyMemberLinkList());
    }

    @Test
    void getHouseMemberLinkList() {

        List<FamilyHouseFamilyMemberLink> expected = houseLink;
        assertEquals(expected, saga.getHouseMemberLinkList());
    }

    @Test
    void setHouseMemberLinkList() {

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
                        embla,
                        helga,
                        "primary",
                        "barn"
                )
        );

        FamilyHouse  njora = new FamilyHouse(
                null,
                "none",
                "handelsvaror",
                "Njoraätten är en främst utvandrad handelsätt",
                "handelsresande",
                "ingen",
                300

        );

        expected.add(
                new FamilyHouseFamilyMemberLink(
                        saga,
                        njora,
                        "Secondary",
                        "handelssyskon"
                )
        );

        saga.setHouseMemberLinkList(expected);

        assertEquals(expected, saga.getHouseMemberLinkList());
    }

    @Test
    void getMemberBiography() {
        String expected = "Uppvuxen vid gubbkroken";
        assertEquals(expected, saga.getMemberBiography());
    }

    @Test
    void setMemberBiography() {
        String expected = "Uppvuxen till största delen i Berghem";
        saga.setMemberBiography(expected);
        assertEquals(expected, saga.getMemberBiography());
    }

    @Test
    void getPersonalityTraits() {
        String expected = "God, sjunger, bågskytt";
        assertEquals(expected, saga.getPersonalityTraits());

    }

    @Test
    void setPersonalityTraits() {
        String expected = "God, sjunger, bågskytt, duktig politiker";
        saga.setPersonalityTraits(expected);
        assertEquals(expected, saga.getPersonalityTraits());
    }

 @Test
    void getJobTitle() {
        String expected = "Ätteledare";
        assertEquals(expected, saga.getJobTitle());

    }

    @Test
    void setJobTitle() {
        String expected = "Ätteledare för Helgaätten";
        saga.setJobTitle(expected);
        assertEquals(expected, saga.getJobTitle());
    }

    @Test
    public void testEquals_and_hashcode() {


        FamilyMember expected = saga;
        FamilyMember testEmbla = embla;

        assertTrue(expected.equals(saga) && saga.equals(expected));
        assertEquals(expected.hashCode(), saga.hashCode());
        assertEquals(testEmbla.hashCode(), embla.hashCode());

    }

    @Test
    void testToString() {
        String expected = "FamilyMember{" + "familyId=" + saga.getFamilyId() +
                ", familyImage='" + saga.getFamilyImage() + '\'' +
                ", name='" + saga.getName() + '\'' +
                ", mother=" + saga.getMother() +
                ", father=" + saga.getFather() +
                ", fictiveMother='" + saga.getFictiveMother() + '\'' +
                ", fictiveFather='" + saga.getFictiveFather() + '\'' +
                ", familyMemberLinkList=" + saga.getFamilyMemberLinkList().size() +
                ", houseMemberLinkList=" + saga.getHouseMemberLinkList().size() +
                ", memberBiography='" + saga.getMemberBiography() + '\'' +
                ", personalityTraits='" + saga.getPersonalityTraits() + '\'' +
                ", jobTitle='" + saga.getJobTitle() + '\'' +
                '}';

        assertEquals(expected, saga.toString());
    }
}