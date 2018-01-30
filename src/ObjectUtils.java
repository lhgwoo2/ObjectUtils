import java.util.List;
import java.util.Map;

public class ObjectUtils {
  public static boolean isEmpty(Object s) {
    if (s == null) {
      return true;
    }
    if ((s instanceof String) && ((String) s).trim().length() == 0) {
      return true;
    }
    /**
     * 위의 방법으로 null 확인을 하기도 하나, String클래스의 경우 isEmpty()-(길이가 0인지 판별)가 존재함으로 해당방식으로도 많이 사용한다.
     * 
     * String s = null or ""; if(s == null || s.isEmpty()){ return true; }
     */

    if (s instanceof Map) {
      return ((Map<?, ?>) s).isEmpty();
    }
    if (s instanceof List) {
      return ((List<?>) s).isEmpty();
    }
    if (s instanceof Object[]) {
      return ((Object[]) s).length == 0;
    }
    return false;
  }

  /**
   * @detail null checking 방식으로 다양한 클래스를 지원하기 위해, Generic 타입의 nullchecking 방식을 사용하여 exception
   *         시스템메시지를 남긴다.
   * @param object
   * @param message
   * @return
   */
  public static <T> T checkNotNull(T object, String message) {
    if (object == null) {
      throw new NullPointerException(message);
    }
    return object;
  }
}
