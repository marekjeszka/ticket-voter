(defproject ticket-voter "0.1.0-SNAPSHOT"
  :description "Application allowing voting on tickets"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [ring/ring-defaults "0.3.2"]]
  :plugins [[lein-cloverage "1.1.1"]]
  :main ^:skip-aot ticket-voter.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
