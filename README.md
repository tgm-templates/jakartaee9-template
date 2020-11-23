Jakarta EE  9 Demo
==================

Jakarta EE 9 Starter template to generate app.

# How to run?

```
$ mvn -DskipTests clean package wildfly:run -PWildfly -Dwildfly.artifactId=wildfly-preview-dist -Dwildfly.version=22.0.0.Alpha1
```

# Development with IntelliJ IDEA

* Please download and extract Wildfly 22.0.0.Alpha1 from https://www.wildfly.org/downloads/
* Add JBoss Server on "Build, Execution, Deployment => Application Servers"
* On "Services" tool window, select "JBoss Server => localhost" to deploy artifacts.

# References

* Jakarta EE: https://jakarta.ee/
* Jakarta EE Specifications: https://jakarta.ee/specifications/
* Jakarta EE 9 Javadoc: https://jakarta.ee/specifications/platform/9/apidocs/
* Eclipse EE4J: https://projects.eclipse.org/projects/ee4j
* RESTEasy: https://resteasy.github.io/

