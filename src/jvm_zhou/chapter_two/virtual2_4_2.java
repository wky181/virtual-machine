package jvm_zhou;

/**
 * @author 武凯焱
 * @date 2019/7/31 11:09
 * @Description: VM Args -Xss128k
 */
public class virtual2_4_2 {
    private int stackLength = 1;

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        virtual2_4_2 oom = new virtual2_4_2();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length: "+ oom.stackLength  );
            throw e;
        }

    }

}
