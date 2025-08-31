package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */
public class UserProfile {
    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    // this removes abstraction because the user of this class needs to know all the fields to create an instance
    // this can we corrected with builder pattern
    public UserProfile(String id, String email, String phone, String displayName, String address, boolean marketingOptIn, String twitter, String github) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.displayName = displayName;
        this.address = address;
        this.marketingOptIn = marketingOptIn;
        this.twitter = twitter;
        this.github = github;
    }

    // public UserProfile(String id, String email) {
    //     this.id = id;
    //     this.email = email;
    // }

    // public UserProfile(String id, String email, String phone) {
    //     this(id, email);
    //     this.phone = phone;
    // }

    // // many setters — mutability leaks
    // public void setId(String id) { this.id = id; }
    // public void setEmail(String email) { this.email = email; }
    // public void setPhone(String phone) { this.phone = phone; }
    // public void setDisplayName(String displayName) { this.displayName = displayName; }
    // public void setAddress(String address) { this.address = address; }
    // public void setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; }
    // public void setTwitter(String twitter) { this.twitter = twitter; }
    // public void setGithub(String github) { this.github = github; }

    // getters
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDisplayName() { return displayName; }
    public String getAddress() { return address; }
    public boolean isMarketingOptIn() { return marketingOptIn; }
    public String getTwitter() { return twitter; }
    public String getGithub() { return github; }
}
