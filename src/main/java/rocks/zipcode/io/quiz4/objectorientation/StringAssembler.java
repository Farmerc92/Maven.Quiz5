package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private StringBuilder build = new StringBuilder();

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        build.append(str);
        build.append(delimeter);
        return this;
    }

    public String assemble() {
        return build.toString().substring(0, build.length() - 1);
    }
}
