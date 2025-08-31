package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("bad id");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("bad email");

        UserProfile p = new UserProfile(id, email, null, null, null, false, null, null);
        // later code keeps mutating...
        return p;
    }

    //since user profile is immutable now, we need to return a new instance if we want this update method
    public UserProfile updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        if (displayName != null && displayName.length() > 100) {
            // silently trim (inconsistent policy)
            displayName = displayName.substring(0, 100);
        }
        return new UserProfile(p.getId(), p.getEmail(), p.getPhone(), displayName, p.getAddress(), p.isMarketingOptIn(), p.getTwitter(), p.getGithub());
    }

}
