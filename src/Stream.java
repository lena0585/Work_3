import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudeGroup> {
    private List<StudeGroup> studeGroupList;

    public Stream(List<StudeGroup> studeGroupList) {
        this.studeGroupList = studeGroupList;
    }

    @Override
    public Iterator<StudeGroup> iterator() {
        return studeGroupList.iterator();
    }

    public int size() {
        int size = 0;

        for (StudeGroup studeGroup : studeGroupList) {
            size++;
        }

        return size;
    }

}
