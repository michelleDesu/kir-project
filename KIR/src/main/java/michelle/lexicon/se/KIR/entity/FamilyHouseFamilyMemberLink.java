package michelle.lexicon.se.KIR.entity;

public class FamilyHouseFamilyMemberLink {

    private int houseMemberLinkId;

    private FamilyMember member;
    private String fictiveMember;
    private FamilyHouse familyHouse;
    private String TypeHousePriority;
    private String memberTitle;

    public FamilyHouseFamilyMemberLink() {
    }


    public FamilyHouseFamilyMemberLink(FamilyMember member, FamilyHouse familyHouse, String typeHousePriority, String memberTitle) {
        this.member = member;
        this.familyHouse = familyHouse;
        TypeHousePriority = typeHousePriority;
        this.memberTitle = memberTitle;
    }


    public FamilyHouseFamilyMemberLink(String fictiveMember, FamilyHouse familyHouse, String typeHousePriority, String memberTitle) {
        this.fictiveMember = fictiveMember;
        this.familyHouse = familyHouse;
        TypeHousePriority = typeHousePriority;
        this.memberTitle = memberTitle;
    }

    public FamilyHouseFamilyMemberLink(int houseMemberLinkId, FamilyMember member, FamilyHouse familyHouse, String typeHousePriority, String memberTitle) {
        this.houseMemberLinkId = houseMemberLinkId;
        this.member = member;
        this.familyHouse = familyHouse;
        TypeHousePriority = typeHousePriority;
        this.memberTitle = memberTitle;
    }

    public int getHouseMemberLinkId() {
        return houseMemberLinkId;
    }

    public String getMemberTitle() {
        return memberTitle;
    }

    public void setMemberTitle(String memberTitle) {
        this.memberTitle = memberTitle;
    }

    public String getFictiveMember() {
        return fictiveMember;
    }

    public void setFictiveMember(String fictiveMember) {
        this.fictiveMember = fictiveMember;
    }

    public FamilyMember getMember() {
        return member;
    }

    public void setMember(FamilyMember member) {
        this.member = member;
    }

    public FamilyHouse getFamilyHouse() {
        return familyHouse;
    }

    public void setFamilyHouse(FamilyHouse familyHouse) {
        this.familyHouse = familyHouse;
    }

    public String getTypeHousePriority() {
        return TypeHousePriority;
    }

    public void setTypeHousePriority(String typeHousePriority) {
        TypeHousePriority = typeHousePriority;
    }


}
