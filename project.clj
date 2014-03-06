(defproject com.stuartsierra/dependency "0.1.2-SNAPSHOT"
  :description "A data structure for representing dependency graphs"
  :url "https://github.com/stuartsierra/dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[com.keminglabs/cljx "0.3.2"]]
  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :clj}

                  {:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :cljs}]}

  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [org.clojure/clojurescript "0.0-2138"]
                                  [com.keminglabs/cljx "0.3.2"]]}
             ;:clj-1.4.0 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             ;:clj-1.3.0 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             })
