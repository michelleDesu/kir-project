package michelle.lexicon.se.KIR.entity;

import java.util.Arrays;
import java.util.Objects;

public class FamilyMember {
    private int familyId;
    private String familyImage;
    private String mother;
    private String father;
    private FamilyMember[] children;
    private FamilyHouse family;
    private String memberBiography;
    private String personalityTraits;

    public FamilyMember() {
    }

    public FamilyMember(int familyId, String familyImage, String mother, String father, FamilyMember[] children, FamilyHouse family, String memberBiography, String personalityTraits) {
        this.familyId = familyId;
        this.familyImage = familyImage;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.family = family;
        this.memberBiography = memberBiography;
        this.personalityTraits = personalityTraits;
    }

    public FamilyMember(String familyImage, String mother, String father, FamilyMember[] children, FamilyHouse family, String memberBiography, String personalityTraits) {
        this.familyImage = familyImage;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.family = family;
        this.memberBiography = memberBiography;
        this.personalityTraits = personalityTraits;
    }

    public int getFamilyId() {
        return familyId;
    }


    public String getFamilyImage() {
        return familyImage;
    }

    public void setFamilyImage(String familyImage) {
        this.familyImage = familyImage;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public FamilyMember[] getChildren() {
        return children;
    }

    public void setChildren(FamilyMember[] children) {
        this.children = children;
    }

    public FamilyHouse getFamily() {
        return family;
    }

    public void setFamily(FamilyHouse family) {
        this.family = family;
    }

    public String getMemberBiography() {
        return memberBiography;
    }

    public void setMemberBiography(String memberBiography) {
        this.memberBiography = memberBiography;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyMember that = (FamilyMember) o;
        return familyId == that.familyId &&
                Objects.equals(familyImage, that.familyImage) &&
                Objects.equals(mother, that.mother) &&
                Objects.equals(father, that.father) &&
                Arrays.equals(children, that.children) &&
                Objects.equals(family, that.family) &&
                Objects.equals(memberBiography, that.memberBiography) &&
                Objects.equals(personalityTraits, that.personalityTraits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(familyId, familyImage, mother, father, family, memberBiography, personalityTraits);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "FamilyMember{" + "familyId=" + familyId +
                ", familyImage='" + familyImage + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", children=" + Arrays.toString(children) +
                ", family=" + family +
                ", memberBiography='" + memberBiography + '\'' +
                ", personalityTraits='" + personalityTraits + '\'' +
                '}';
    }
}
