public class StudeGroup {
    private String groupName;

    public StudeGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "StudeGroup [groupName=" + groupName + "]";
    }
}
