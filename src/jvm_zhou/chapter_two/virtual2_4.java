package jvm_zhou;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 武凯焱
 * @date 2019/7/14 11:27
 * @Description:
 */
public class virtual2_4 {
    static class OOMObject{
    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }

    }
}
