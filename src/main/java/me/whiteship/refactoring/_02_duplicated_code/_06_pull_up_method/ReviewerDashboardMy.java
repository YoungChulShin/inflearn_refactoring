package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.kohsuke.github.GHIssue;

public class ReviewerDashboardMy extends DashboardMy {

    public void printReviewers() throws IOException {
        GHIssue issue = getGhIssue(30);
        Set<String> reviewers = getUserName(issue);
        print(reviewers);
    }
}
