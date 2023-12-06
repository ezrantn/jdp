package FlyweightPattern.Trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypeMap.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypeMap.put(name, result);
        }
        return result;
    }
}
