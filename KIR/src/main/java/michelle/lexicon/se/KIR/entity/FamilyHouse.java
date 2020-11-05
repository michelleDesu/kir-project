package michelle.lexicon.se.KIR.entity;

import java.util.List;
import java.util.Objects;

public class FamilyHouse {

    private int familyHouseId;
    private List<FamilyHouseFamilyMemberLink> familyMembers;

    private String highSeat;
    private String resources;
    private String description; //describes the house
    private String typicalTraits;
    private String militaryForce;
    private int population;

    public FamilyHouse() {
    }

    public FamilyHouse(List<FamilyHouseFamilyMemberLink> familyMembers, String highSeat, String resources, String description, String typicalTraits, String militaryForce, int population) {
        this.familyMembers = familyMembers;
        this.highSeat = highSeat;
        this.resources = resources;
        this.description = description;
        this.typicalTraits = typicalTraits;
        this.militaryForce = militaryForce;
        this.population = population;
    }

    public FamilyHouse(int familyHouseId, List<FamilyHouseFamilyMemberLink> familyMembers, String highSeat, String resources, String description, String typicalTraits, String militaryForce, int population) {
        this.familyHouseId = familyHouseId;
        this.familyMembers = familyMembers;
        this.highSeat = highSeat;
        this.resources = resources;
        this.description = description;
        this.typicalTraits = typicalTraits;
        this.militaryForce = militaryForce;
        this.population = population;
    }

    public int getFamilyHouseId() {
        return familyHouseId;
    }

    public List<FamilyHouseFamilyMemberLink> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyHouseFamilyMemberLink> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getHighSeat() {
        return highSeat;
    }

    public void setHighSeat(String highSeat) {
        this.highSeat = highSeat;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypicalTraits() {
        return typicalTraits;
    }

    public void setTypicalTraits(String typicalTraits) {
        this.typicalTraits = typicalTraits;
    }

    public String getMilitaryForce() {
        return militaryForce;
    }

    public void setMilitaryForce(String militaryForce) {
        this.militaryForce = militaryForce;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyHouse that = (FamilyHouse) o;
        return familyHouseId == that.familyHouseId &&
                population == that.population &&
                Objects.equals(familyMembers, that.familyMembers) &&
                Objects.equals(highSeat, that.highSeat) &&
                Objects.equals(resources, that.resources) &&
                Objects.equals(description, that.description) &&
                Objects.equals(typicalTraits, that.typicalTraits) &&
                Objects.equals(militaryForce, that.militaryForce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyHouseId, highSeat, resources, description, typicalTraits, militaryForce, population);
    }

    @Override
    public String toString() {
        return "FamilyHouse{" + "familyHouseId=" + familyHouseId +
                ", importantPersons=" + familyMembers.size() +
                ", highSeat='" + highSeat + '\'' +
                ", resources='" + resources + '\'' +
                ", description='" + description + '\'' +
                ", typicalTraits='" + typicalTraits + '\'' +
                ", militaryForce='" + militaryForce + '\'' +
                ", population=" + population +
                '}';
    }
}
