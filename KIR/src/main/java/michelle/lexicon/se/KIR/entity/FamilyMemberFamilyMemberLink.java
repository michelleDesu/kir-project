package michelle.lexicon.se.KIR.entity;

import java.util.Objects;

public class FamilyMemberFamilyMemberLink {

    private int familyLinkId;

    private FamilyMember relative;
    private FamilyMember member;
    private String Relation; // what relation do the characters have?

    public FamilyMemberFamilyMemberLink() {
    }

    public FamilyMemberFamilyMemberLink(FamilyMember relative, FamilyMember member, String relation) {
        this.relative = relative;
        this.member = member;
        Relation = relation;
    }

    public FamilyMemberFamilyMemberLink(int familyLinkId, FamilyMember relative, FamilyMember member, String relation) {
        this.familyLinkId = familyLinkId;
        this.relative = relative;
        this.member = member;
        Relation = relation;
    }

    public int getFamilyLinkId() {
        return familyLinkId;
    }

    public FamilyMember getRelative() {
        return relative;
    }

    public void setRelative(FamilyMember relative) {
        this.relative = relative;
    }

    public FamilyMember getMember() {
        return member;
    }

    public void setMember(FamilyMember member) {
        this.member = member;
    }

    public String getRelation() {
        return Relation;
    }

    public void setRelation(String relation) {
        Relation = relation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyMemberFamilyMemberLink that = (FamilyMemberFamilyMemberLink) o;
        return familyLinkId == that.familyLinkId &&
                Objects.equals(relative, that.relative) &&
                Objects.equals(member, that.member) &&
                Objects.equals(Relation, that.Relation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyLinkId, relative, member, Relation);
    }

    @Override
    public String toString() {
        return "FamilyMemberLink{" + "familyLinkId=" + familyLinkId +
                ", relative=" + relative +
                ", member=" + member +
                ", Relation='" + Relation + '\'' +
                '}';
    }
}


