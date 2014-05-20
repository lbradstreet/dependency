(defproject com.stuartsierra/dependency "0.1.4-SNAPSHOT"
  :description "A data structure for representing dependency graphs"
  :url "https://github.com/stuartsierra/dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;:resource-paths  ["target/generated/src/cljs"]
  :source-paths  ["target/generated"]

  :hooks [cljx.hooks]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [org.clojure/clojurescript "0.0-2156"]
                                  [com.keminglabs/cljx "0.3.2"]]
                   :plugins [[com.keminglabs/cljx "0.3.2"]
                             [com.cemerick/austin  "0.1.4"]]
                   :prep-tasks  ["cljx"]
                   :cljx {:builds [{:source-paths ["src"]
                                    :output-path "target/generated"
                                    :rules :clj}

                                   {:source-paths ["src"]
                                    :output-path "target/generated"
                                    :rules :cljs}]}}
             :clj-1.4.0 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :clj-1.3.0 {:dependencies [[org.clojure/clojure "1.3.0"]]}})
