package Lecture_3_Design_patterns.Builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private String  drivingLicence;
    private boolean isMarried;

    private Person (Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicence = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    static class Builder {
        private final String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
