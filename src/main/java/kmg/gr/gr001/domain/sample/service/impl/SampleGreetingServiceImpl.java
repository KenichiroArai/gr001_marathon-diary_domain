package kmg.gr.gr001.domain.sample.service.impl;

import org.springframework.stereotype.Service;

import kmg.gr.gr001.domain.sample.service.SampleGreetingService;

/**
 * サンプル挨拶サービスの実装<br>
 * <p>
 * 固定メッセージを返す配線確認用の実装です。
 * </p>
 *
 * @author KenichiroArai
 *
 * @since 0.1.0
 *
 * @version 0.1.0
 */
@Service
public class SampleGreetingServiceImpl implements SampleGreetingService {

    /**
     * サンプル挨拶メッセージ
     *
     * @since 0.1.0
     */
    @SuppressWarnings("nls")
    private static final String MESSAGE = "Hello from sample domain";

    /**
     * デフォルトコンストラクタ
     *
     * @since 0.1.0
     */
    public SampleGreetingServiceImpl() {

        // 処理なし
    }

    /**
     * {@inheritDoc}
     *
     * @since 0.1.0
     */
    @Override
    public String greet() {

        /* 戻り値の宣言 */
        final String result;

        /* 固定メッセージの返却 */
        result = SampleGreetingServiceImpl.MESSAGE;

        return result;

    }

}
