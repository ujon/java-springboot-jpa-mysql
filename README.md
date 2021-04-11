# java-springboot-jpa-mysql

using:

- java v1.8
- Spring Boot v2.4.4
- JPA
- MySQL v5.6

## Configure

### Environment

#### All

- add below option

```
-Dspring.profile.location=classpath:/config/
```

#### Local

1. activate temporary mysql with docker

```bash
sudo docker run --name mysql-temp -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:5.6
```

2. CREATE DATABASE JPATEST
