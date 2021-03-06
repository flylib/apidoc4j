package io.github.flylib.apidoc4j.parser.model.field;

/**
 * @author liushaoming
 * @Package com.minshenglife.apidoc.plugin.model.field
 * @Description:
 * @date 2017-12-27 15:43
 *
 * Success return Parameter.
 * Usage: @apiSuccess {String} firstname Firstname of the User.
 */
public class ApiSuccess {
    private String group;
    private String type;
    private String field;
    private String description;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ApiSuccess{" +
                "group='" + group + '\'' +
                ", type='" + type + '\'' +
                ", field='" + field + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
