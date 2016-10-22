package paradigms.greedy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Leonti on 2016-09-18.
 */
public class LIS {
    // TODO: modify to return result array
    // TODO: REMEMBER EXTREMAL CASES
    private int longestIncreasingSequenceQuery(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        int pos;
        for (int i = 0; i < a.length; i++) {
            pos = Collections.binarySearch(l, a[i]);
            if (pos < 0) pos = -(pos + 1);
            if (pos >= l.size()) l.add(a[i]);
            else l.set(pos, a[i]);
        }
        return l.size();
    }
}
