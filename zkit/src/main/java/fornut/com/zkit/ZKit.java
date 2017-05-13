package fornut.com.zkit;

/**
 * Created by simon on 2017/5/13.
 */

public class ZKit {

    /**
     *判断字符串是否为空
     * @param string
     * @return
     */
    public static boolean isEmpty(String string) {
        return string == null || (string.trim().length() <= 0);
    }
}
