package CityTech.gui.gpacalculator.model;

public class GradeStatus {

        private String letterGrade;
        private float gpa;
        private String description;
        private float score;

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GradeStatus{" +
                "letterGrade='" + letterGrade + '\'' +
                ", gpa=" + gpa +
                ", description='" + description + '\'' +
                ", score=" + score +
                '}';
    }
}

