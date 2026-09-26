# marathon-diary domain

マラソン日記のロジックである。

## 概要

本リポジトリは、マラソン日記（marathon-diary）のドメインロジックをまとめる。

- Java 25 / Spring Boot 4.1.1（ライブラリ jar）
- Maven（`packaging` jar）
- ドメインサービス（`@Service`）
- 基盤ライブラリ: kmg-core / kmg-fund

HTTP / UI / DB マイグレーションは含めない。REST API は `gr001_marathon-diary_api` を参照する。

## 必要環境

- JDK 25
- Maven 3.6.3 以降
- kmg-core / kmg-fund（ローカル `mvn install` または GitHub Packages）

## ビルド

```bash
# テスト（JaCoCo レポート生成 + 行/分岐カバレッジ 100% チェック）
mvn test

# パッケージ（通常 jar）
mvn package
```

カバレッジレポートは `target/site/jacoco/index.html` に出力される。
`target/jacoco.exec` は Eclipse のカバレッジ表示と共有できる。

成果物は `target/gr001_marathon-diary_domain-0.1.0.jar`（実行可能 fat jar ではない）。

## ディレクトリ構成

```text
src/main/java/kmg/marathondiary/domain/
  service/             # ドメインサービスインタフェース
  service/impl/        # 実装（@Service）
src/test/java/         # テスト
```

## ライセンス

[MIT License](./LICENSE)
