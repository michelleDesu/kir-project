package michelle.lexicon.se.KIR.entity;

import java.util.List;
import java.util.Objects;

public class FamilyMember {
    private int familyId;
    private String familyImage;
    private String name;
    private FamilyMember mother;
    private FamilyMember father;
    private String fictiveMother;
    private String fictiveFather;
    private List<FamilyMemberFamilyMemberLink> familyMemberLinkList;
    private List<FamilyHouseFamilyMemberLink> houseMemberLinkList;
    private String memberBiography;
    private String personalityTraits;
    private String jobTitle;

    public FamilyMember() { }

    public FamilyMember(int familyId, String familyImage, String name, FamilyMember mother, FamilyMember father, String fictiveMother, String fictiveFather, List<FamilyMemberFamilyMemberLink> familyMemberLinkList, List<FamilyHouseFamilyMemberLink> houseMemberLinkList, String memberBiography, String personalityTraits, String jobTitle) {
        this.familyId = familyId;
        this.familyImage = familyImage;
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.fictiveMother = fictiveMother;
        this.fictiveFather = fictiveFather;
        this.familyMemberLinkList = familyMemberLinkList;
        this.houseMemberLinkList = houseMemberLinkList;
        this.memberBiography = memberBiography;
        this.personalityTraits = personalityTraits;
        this.jobTitle = jobTitle;
    }

    public FamilyMember(String familyImage, String name, FamilyMember mother, FamilyMember father, String fictiveMother, String fictiveFather, List<FamilyMemberFamilyMemberLink> familyMemberLinkList, List<FamilyHouseFamilyMemberLink> houseMemberLinkList, String memberBiography, String personalityTraits, String jobTitle) {
        this.familyImage = familyImage;
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.fictiveMother = fictiveMother;
        this.fictiveFather = fictiveFather;
        this.familyMemberLinkList = familyMemberLinkList;
        this.houseMemberLinkList = houseMemberLinkList;
        this.memberBiography = memberBiography;
        this.personalityTraits = personalityTraits;
        this.jobTitle = jobTitle;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<FamilyMemberFamilyMemberLink> getFamilyMemberLinkList() {
        return familyMemberLinkList;
    }

    public void setFamilyMemberLinkList(List<FamilyMemberFamilyMemberLink> familyMemberLinkList) {
        this.familyMemberLinkList = familyMemberLinkList;
    }

    public List<FamilyHouseFamilyMemberLink> getHouseMemberLinkList() {
        return houseMemberLinkList;
    }

    public void setHouseMemberLinkList(List<FamilyHouseFamilyMemberLink> houseMemberLinkList) {
        this.houseMemberLinkList = houseMemberLinkList;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyMember that = (FamilyMember) o;
        return familyId == that.familyId &&
                Objects.equals(familyImage, that.familyImage) &&
                Objects.equals(name, that.name) &&
                Objects.equals(mother, that.mother) &&
                Objects.equals(father, that.father) &&
                Objects.equals(fictiveMother, that.fictiveMother) &&
                Objects.equals(fictiveFather, that.fictiveFather) &&
                Objects.equals(familyMemberLinkList, that.familyMemberLinkList) &&
                Objects.equals(houseMemberLinkList, that.houseMemberLinkList) &&
                Objects.equals(memberBiography, that.memberBiography) &&
                Objects.equals(personalityTraits, that.personalityTraits) &&
                Objects.equals(jobTitle, that.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyId, familyImage, name, mother, father, fictiveMother, fictiveFather, memberBiography, personalityTraits, jobTitle);
    }

    @Override
    public String toString() {
        return "FamilyMember{" + "familyId=" + familyId +
                ", familyImage='" + familyImage + '\'' +
                ", name='" + name + '\'' +
                ", mother=" + mother +
                ", father=" + father +
                ", fictiveMother='" + fictiveMother + '\'' +
                ", fictiveFather='" + fictiveFather + '\'' +
                ", familyMemberLinkList=" + familyMemberLinkList.size() +
                ", houseMemberLinkList=" + houseMemberLinkList.size() +
                ", memberBiography='" + memberBiography + '\'' +
                ", personalityTraits='" + personalityTraits + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
