package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class ParticipantDashboardMy extends DashboardMy {

    public void printParticipants(int eventId) throws IOException {
        GHIssue issue = getGhIssue(eventId);
        Set<String> participants = getUserName(issue);
        print(participants);
    }
}
