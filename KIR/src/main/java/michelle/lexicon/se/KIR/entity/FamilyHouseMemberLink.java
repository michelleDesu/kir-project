package michelle.lexicon.se.KIR.entity;

import java.util.Objects;

public class FamilyHouseMemberLink {

    private FamilyMember member;
    private FamilyHouse family;
    private String TypeHousePriority;

    public FamilyHouseMemberLink() {
    }

    public FamilyHouseMemberLink(FamilyMember member, FamilyHouse family, String typeHousePriority) {
        this.member = member;
        this.family = family;
        TypeHousePriority = typeHousePriority;
    }

    public FamilyMember getMember() {
        return member;
    }

    public void setMember(FamilyMember member) {
        this.member = member;
    }

    public FamilyHouse getFamily() {
        return family;
    }

    public void setFamily(FamilyHouse family) {
        this.family = family;
    }

    public String getTypeHousePriority() {
        return TypeHousePriority;
    }

    public void setTypeHousePriority(String typeHousePriority) {
        TypeHousePriority = typeHousePriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyHouseMemberLink that = (FamilyHouseMemberLink) o;
        return Objects.equals(member, that.member) &&
                Objects.equals(family, that.family) &&
                Objects.equals(TypeHousePriority, that.TypeHousePriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, family, TypeHousePriority);
    }

    @Override
    public String toString() {
        return "FamilyHouseMemberLink{" + "member=" + member +
                ", family=" + family +
                ", TypeHousePriority='" + TypeHousePriority + '\'' +
                '}';
    }
}
