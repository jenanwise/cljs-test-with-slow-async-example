(require 'cljs.closure)
(cljs.closure/build "src" {:main 'cljs-test-with-slow-async-example.core-test
                           :output-to "out/main.js"})
