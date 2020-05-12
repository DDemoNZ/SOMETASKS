public class BuilderMeth {
    private String name;
    private String surname;
    private int age;
    private String stugentNumber;
    private double averageMark;

    private BuilderMeth() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getStugentNumber() {
        return stugentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + stugentNumber + " " + averageMark;
    }

    public static Builder newBuilder() {
        return new BuilderMeth().new Builder();
    }

    public class Builder {
        private Builder() {

        }

        public Builder setName(String name) {
            BuilderMeth.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            BuilderMeth.this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            BuilderMeth.this.age = age;
            return this;
        }

        public Builder setStugentNumber(String stugentNumber) {
            BuilderMeth.this.stugentNumber = stugentNumber;
            return this;
        }

        public Builder setAverageMark(double averageMark) {
            BuilderMeth.this.averageMark = averageMark;
            return this;
        }

        public BuilderMeth build() {
            return BuilderMeth.this;
        }
    }
}