(ns cljs-test-with-slow-async-example.core-test
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :refer [timeout]]
            [cljs.test :refer-macros [async deftest testing is run-tests]]))

(enable-console-print!)

(deftest a-test
  (async done
         (testing "a slow async test"
           (go
             (<! (timeout 1000))
             (is (= 0 1))
             (done)))))

(run-tests 'cljs-test-with-slow-async-example.core-test)
