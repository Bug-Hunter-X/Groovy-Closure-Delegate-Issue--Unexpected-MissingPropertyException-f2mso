```groovy
def foo(Closure c) {
  c.delegate = this
  c() 
}

foo { println it.toString() }
```
This code will throw a `groovy.lang.MissingPropertyException` because the closure's delegate is set to the `foo` method's `this`, which is likely not the intended object.  The closure will then attempt to call `toString()` on this `this`, which may not be defined.