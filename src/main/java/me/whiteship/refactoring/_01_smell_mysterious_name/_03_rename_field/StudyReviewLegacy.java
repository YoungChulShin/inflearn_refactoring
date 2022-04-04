package me.whiteship.refactoring._01_smell_mysterious_name._03_rename_field;

import java.util.Objects;

public class StudyReviewLegacy {

  private final String reviewer;
  private final String review;

  public StudyReviewLegacy(String reviewer, String review) {
    this.reviewer = reviewer;
    this.review = review;
  }

  public String getReviewer() {
    return reviewer;
  }

  public String getReview() {
    return review;
  }

  @Override
  public String toString() {
    return "StudyReview[reviewer=" + reviewer + ", review=" + review;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    StudyReviewLegacy target = (StudyReviewLegacy) o;
    return review.equals(target.review) && reviewer.equals(target.reviewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewer, review);
  }
}
