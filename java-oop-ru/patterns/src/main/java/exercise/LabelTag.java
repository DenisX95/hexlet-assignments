package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    private String value;
    private TagInterface childTag;

    public LabelTag(String value, TagInterface childTag) {
        this.value = value;
        this.childTag = childTag;
    }

    @Override
    public String render() {
        return "<label>" + value + childTag.render() + "</label>";
    }
}
// END
