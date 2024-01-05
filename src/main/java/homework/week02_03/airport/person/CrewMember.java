package homework.week02_03.airport.person;

import homework.week02_03.airport.enums.CrewRole;

public class CrewMember extends Person implements SafetyProcedure {
    private CrewRole crewRole;
    private String licenseId;

    public CrewMember(String firstName, String lastName, CrewRole crewRole, String licenseId) {
        super(firstName, lastName);
        this.crewRole = crewRole;
        this.licenseId = licenseId;
    }

    public CrewRole getCrewRole() {
        return crewRole;
    }

    public String getLicenseId() {
        return licenseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrewMember that = (CrewMember) o;

        if (crewRole != that.crewRole) return false;
        return licenseId.equals(that.licenseId);
    }

    @Override
    public int hashCode() {
        int result = crewRole.hashCode();
        result = 31 * result + licenseId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "name: " + getFirstName() + " " + getLastName() + ", role: " + crewRole + ", licence: " + licenseId;
    }


    @Override
    public void provideFirstAid() {
        System.out.println("Start first aid procedure");
    }
}
