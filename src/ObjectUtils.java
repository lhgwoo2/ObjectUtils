import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

public class ObjectUtils {
  public static boolean isEmpty(Object s) {
    if (s == null) {
      return true;
    }
    if ((s instanceof String) && ((String) s).trim().length() == 0) {
      return true;
    }
    /**
     * ���� ������� null Ȯ���� �ϱ⵵ �ϳ�, StringŬ������ ��� isEmpty()-(���̰� 0���� �Ǻ�)�� ���������� �ش������ε� ���� ����Ѵ�.
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
   * @detail null checking ������� �پ��� Ŭ������ �����ϱ� ����, Generic Ÿ���� nullchecking ����� ����Ͽ� exception
   *         �ý��۸޽����� �����.
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
