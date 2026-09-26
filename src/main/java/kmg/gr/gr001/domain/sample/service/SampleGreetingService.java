package kmg.gr.gr001.domain.sample.service;

/**
 * サンプル挨拶サービスのインタフェース<br>
 * <p>
 * ドメイン → API → 画面の配線確認用です。
 * </p>
 *
 * @author KenichiroArai
 *
 * @since 0.1.0
 *
 * @version 0.1.0
 */
public interface SampleGreetingService {

    /**
     * サンプル挨拶メッセージを返す
     *
     * @return 挨拶メッセージ
     *
     * @since 0.1.0
     */
    String greet();

}
