# 建议生产使用，ref: http://blog.tenxcloud.com/?p=1894
FROM fabric8/java-jboss-openjdk8-jdk

USER root

COPY deepexi-statistics-center-provider/target/demo.jar /home/