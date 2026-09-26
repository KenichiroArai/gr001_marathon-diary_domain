package kmg.gr.gr001.domain.sample.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * SampleGreetingServiceImpl のテスト
 *
 * @author KenichiroArai
 *
 * @since 0.1.0
 *
 * @version 0.1.0
 */
@SuppressWarnings({
    "nls", "static-method",
})
public class SampleGreetingServiceImplTest {

    /**
     * デフォルトコンストラクタ
     *
     * @since 0.1.0
     */
    public SampleGreetingServiceImplTest() {

        // 処理なし
    }

    /**
     * コンストラクタのテスト - 正常系:インスタンスを生成できる場合
     *
     * @since 0.1.0
     */
    @Test
    public void testConstructor_normal() {

        /* 期待値の定義 */

        /* 準備 */

        /* テスト対象の実行 */
        final SampleGreetingServiceImpl testTarget = new SampleGreetingServiceImpl();

        /* 検証の準備 */

        /* 検証の実施 */
        Assertions.assertNotNull(testTarget, "インスタンスが生成されていません");

    }

    /**
     * greet メソッドのテスト - 正常系:固定メッセージが返る場合
     *
     * @since 0.1.0
     */
    @Test
    public void testGreet_normalMessage() {

        /* 期待値の定義 */
        final String expectedMessage = "Hello from sample domain";

        /* 準備 */
        final SampleGreetingServiceImpl testTarget = new SampleGreetingServiceImpl();

        /* テスト対象の実行 */
        final String testResult = testTarget.greet();

        /* 検証の準備 */
        final String actualMessage = testResult;

        /* 検証の実施 */
        Assertions.assertEquals(expectedMessage, actualMessage, "挨拶メッセージが一致しません");

    }

}
