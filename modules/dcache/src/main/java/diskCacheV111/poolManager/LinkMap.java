package diskCacheV111.poolManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class LinkMap {

    private class LinkMapEntry {

        private Link _link;
        private int _counter;

        private LinkMapEntry(Link link) {
            _link = link;
            _counter = link._uGroupList.size() - 1;
        }
    }
    private Map<String, LinkMapEntry> _linkHash = new HashMap<String, LinkMapEntry>();

    Iterator<Link> iterator() {
        List<Link> list = new ArrayList<Link>();
        for (LinkMapEntry e : _linkHash.values()) {
            if (e._counter <= 0) {
                list.add(e._link);
            }
        }
        return list.iterator();
    }

    void addLink(Link link) {
        LinkMapEntry found = _linkHash.get(link.getName());
        if (found == null) {
            _linkHash.put(link.getName(), new LinkMapEntry(link));
        } else {
            found._counter--;
        }
    }

}
