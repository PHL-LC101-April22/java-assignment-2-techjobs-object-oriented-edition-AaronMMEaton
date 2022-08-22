package org.launchcode.techjobs.oo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Job {

    private int id;
    private final int id;
    private static int nextId = 1;

    private String name;
    @@ -47,6 +49,53 @@ public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        String finalString = "\nID: " + this.getId() + '\n';
        int nullCount = 0;

        if (this.name == null || this.name.equals("")) {
            finalString += "Name: Data not available\n";
            nullCount += 1;
        } else {
            finalString += "Name: " + this.name + '\n';
        }

        if (this.employer == null || this.employer.getValue().equals("")) {
            finalString += "Employer: Data not available\n";
            nullCount += 1;
        } else {
            finalString += "Employer: " + this.employer.getValue() + '\n';
        }

        if (this.location == null || this.location.getValue().equals("")) {
            finalString += "Location: Data not available\n";
            nullCount += 1;
        } else {
            finalString += "Location: " + this.location.getValue() + '\n';
        }

        if (this.positionType == null || this.positionType.getValue().equals("")) {
            finalString += "Position Type: Data not available\n";
            nullCount += 1;
        } else {
            finalString += "Position Type: " + this.positionType.getValue() + '\n';
        }

        if (this.coreCompetency == null || this.coreCompetency.getValue().equals("")) {
            finalString += "Core Competency: Data not available\n";
            nullCount += 1;
        } else {
            finalString += "Core Competency: " + this.coreCompetency.getValue() + '\n';
        }

        if (nullCount == 5) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return finalString;
        }
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
