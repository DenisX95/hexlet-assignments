package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class Tag {

    protected String tagName;
    protected Map<String, String> attributes;
    protected String body;
    protected List<Tag> childTags;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = new LinkedHashMap<>(attributes);
    }

    public Tag(String tagName, Map<String, String> attributes, String body, List<Tag> childTags) {
        this.tagName = tagName;
        this.attributes = new LinkedHashMap<>(attributes);
        this.body = body;
        this.childTags = new ArrayList<>(childTags);
    }

    public String getTagName() {
        return tagName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<" + tagName);
        attributes.forEach((k, v) -> sb.append(String.format(" %s=\"%s\"", k, v)));
        sb.append(">");
        return sb.toString();
    }

}
// END
