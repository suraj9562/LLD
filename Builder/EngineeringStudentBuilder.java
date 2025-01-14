package Builder;

import java.util.List;
import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder {

    public EngineeringStudentBuilder() {

    }

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer Architecture");
        this.subjects = subs;
        return this;
    }

}
