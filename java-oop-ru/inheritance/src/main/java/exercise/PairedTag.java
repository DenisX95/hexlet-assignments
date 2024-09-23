package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{

    public PairedTag(String tagName, Map<String, String> attributes, String body, List<Tag> childTags) {
        super(tagName, attributes, body, childTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        childTags.forEach(o -> sb.append(o.toString()));
        sb.append(body);
        sb.append("</" + tagName + ">");
        return sb.toString();
    }
}
// END
