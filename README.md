orchestrator_test_java
=============

This is a bare java library; the rest is up to you.


Building and Testing
====================

For various reasons, `logentries-parent` requires at least one commit before building is possible:
```
git init
git add README.md
git commit -m "Initial commit"
```

The project can then be fully built, including testing, by running `mvn clean verify`.