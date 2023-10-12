# java-cli-sbt-hibernate-cockroachdb-single-node-without-ssl-simple

## Description
Creates a small database table
called `dog` and populates with
hql.
A java sbt build, that connects to single node
cockroach database without ssl.

## Tech stack
- java
- sbt
  - hibernate
  - hql
  - log4j
  - postgres drivers

## Docker stack
- cockroachdb/cockroach:v19.2.2
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- [webui](http://localhost:8080)

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [HQL code based on](https://www.journaldev.com/2954/hibernate-query-language-hql-example-tutorial)
- [Hibernate config based on](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/An-example-hibernatecfgxml-for-MySQL-8-and-Hibernate-5)
- [Hibernate code based on](https://github.com/lokeshgupta1981/hibernate/tree/master/hibernate-hello-world)
