build:
  mvn -DskipTests clean build

dev:
  mvn -DskipTests clean package wildfly:run -PWildfly -Dwildfly.artifactId=wildfly-preview-dist -Dwildfly.version=22.0.0.Alpha1
