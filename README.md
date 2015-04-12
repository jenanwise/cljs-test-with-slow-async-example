# cljs-test-with-slow-async-example

Minimal test case demonstrating that cljs.test's report summary can
run and print before async tests complete (using their `done`
callback).

## Usage

```bash
# build out/main.js
./build
```

Then open `test.html` in your browser and view the console. You should see:

```
Testing cljs-test-with-slow-async-example.core-test

Ran 1 tests containing 0 assertions.
0 failures, 0 errors.

<1 second elapses>

FAIL in () (cljs_test_with_slow_async_example/core_test.js:201:49)
expected: (= 0 1)
  actual: (not (= 0 1))
```
