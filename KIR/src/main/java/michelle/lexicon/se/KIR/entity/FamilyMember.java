package michelle.lexicon.se.KIR.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FamilyMember {
    private int familyId;
    private String familyImage;
    private FamilyMember mother;
    private FamilyMember father;
    private String fictiveMother;
    private String fictiveFather;
    private List<FamilyMemberLink> children;
    private List<FamilyHouseMemberLink> family;
    private String memberBiography;
    private String personalityTraits;

    public FamilyMember() { }

    public FamilyMember(int familyId, String familyImage, FamilyMember mother, FamilyMember father, String fictiveMother, String fictiveFather, List<FamilyMemberLink> children, List<FamilyHouseMemberLink> family, String memberBiography, String personalityTraits) {
        this.familyId = familyId;
        this.familyImage = familyImage;
        this.mother = mother;
        this.father = father;
        this.fictiveMother = fictiveMother;
        this.fictiveFather = fictiveFather;
        this.children = children;
        this.family = family;
        this.memberBiography = memberBiography;
        this.personalityTraits = personalityTraits;
    }

    public FamilyMember(String familyImage, FamilyMember mother, FamilyMember father, String fictiveMother, String fictiveFather, List<FamilyMemberLink> children, List<FamilyHouseMemberLink> family, String memberBiography, String personalityTraits) {
        this.familyImage = familyImage;
        this.mother = mother;
        this.father = father;
        this.fictiveMother = fictiveMother;
        this.fictiveFather = fictiveFather;
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

    public FamilyMember getMother() {
        return mother;
    }

    public void setMother(FamilyMember mother) {
        this.mother = mother;
    }

    public FamilyMember getFather() {
        return father;
    }

    public void setFather(FamilyMember father) {
        this.father = father;
    }

    public String getFictiveMother() {
        return fictiveMother;
    }

    public void setFictiveMother(String fictiveMother) {
        this.fictiveMother = fictiveMother;
    }

    public String getFictiveFather() {
        return fictiveFather;
    }

    public void setFictiveFather(String fictiveFather) {
        this.fictiveFather = fictiveFather;
    }

    public List<FamilyMemberLink> getChildren() {
        return children;
    }

    public void setChildren(List<FamilyMemberLink> children) {
        this.children = children;
    }

    public List<FamilyHouseMemberLink> getFamily() {
        return family;
    }

    public void setFamily(List<FamilyHouseMemberLink> family) {
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
                Objects.equals(fictiveMother, that.fictiveMother) &&
                Objects.equals(fictiveFather, that.fictiveFather) &&
                Objects.equals(children, that.children) &&
                Objects.equals(family, that.family) &&
                Objects.equals(memberBiography, that.memberBiography) &&
                Objects.equals(personalityTraits, that.personalityTraits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyId, familyImage, mother, father, fictiveMother, fictiveFather, children, family, memberBiography, personalityTraits);
    }

    @Override
    public String toString() {
        return "FamilyMember{" + "familyId=" + familyId +
                ", familyImage='" + familyImage + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                ", fictiveMother='" + fictiveMother + '\'' +
                ", fictiveFather='" + fictiveFather + '\'' +
                ", children=" + children +
                ", family=" + family +
                ", memberBiography='" + memberBiography + '\'' +
                ", personalityTraits='" + personalityTraits + '\'' +
                '}';
    }
}
