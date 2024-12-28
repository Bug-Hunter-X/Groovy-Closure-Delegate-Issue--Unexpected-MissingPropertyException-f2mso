# Groovy Closure Delegate Issue

This repository demonstrates a subtle bug related to the usage of `delegate` within Groovy closures, specifically when the closure is passed as an argument to a method. The issue manifests as an unexpected `MissingPropertyException`.