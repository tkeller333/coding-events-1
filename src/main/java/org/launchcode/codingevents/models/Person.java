package org.launchcode.codingevents.models;

import javax.persistence.Entity;

@Entity
public class Person extends AbstractEntity{

    private String name;

    private String location;
    // contact information
    private String occupation;
    private String company;

    // events attended - with links to the events
    // events attending - with links to the events
    // areas of interest
}
