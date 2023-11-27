package homework.week02_03.airport.person;

public class CrewMember extends Person implements SafetyProcedure {
    private CrewRole crewRole;
    private String licenceId;

    public CrewMember(String firstName, String lastName, CrewRole crewRole, String licenceId) {
        super(firstName, lastName);
        this.crewRole = crewRole;
        this.licenceId = licenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrewMember that = (CrewMember) o;

        if (crewRole != that.crewRole) return false;
        return licenceId.equals(that.licenceId);
    }

    @Override
    public int hashCode() {
        int result = crewRole.hashCode();
        result = 31 * result + licenceId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "name: " + getFirstName() + " " + getLastName() + ", role: " + crewRole + ", licence: " + licenceId;
    }


    @Override
    public void provideFirstAid() {
        System.out.println("Start first aid procedure");
    }
}
