# uStoreClaro-vmAdmin

## Teste técnico para o time uStore Claro

## VM-Admin API

API RESTful desenvolvida em **Java 24 + Spring Boot**, com persistência em **PostgreSQL**, responsável pelo gerenciamento de máquinas virtuais. Esta aplicação permite criar, listar, atualizar parcialmente e visualizar detalhes de VMs.

---

## Tecnologias Utilizadas

- Java 24
- Spring Boot 3.5
- PostgreSQL 15+
- Hibernate (JPA)
- Lombok
- Swagger (Springdoc OpenAPI)
- Gradle

---

## Como Rodar o Projeto Localmente

### 1. Clone o repositório

```bash
git clone https://github.com/thomasbrasil46/uStoreClaro-vmAdmin.git
cd seu-diretorio
```

### 2. Crie um banco no PostgreSQL:

**Necessário ter o PostgreSql instalado. Disponível em: [pgAdmin](https://www.pgadmin.org/download/)**

```sql
CREATE DATABASE vm_admin;
```

### 3. Crie um usuário e senha

```sql
CREATE USER vm_user WITH PASSWORD 'senhaSegura123';
```

### 4. Forneça permissão total ao usuário

```sql
GRANT ALL PRIVILEGES ON DATABASE vm_admin TO vm_user;
```

### 5. No projeto anteriormente clonado, altere o arquivo **application.properties**

```
spring.datasource.url=jdbc:postgresql://localhost:5432/vm_admin
spring.datasource.username=vm_user
spring.datasource.password=senhaSegura123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### 6. Compile e rode o projeto

**Em seu terminal, execute o comando:**

```
./gradlew bootRun
```

---

Após esse passo a passo, acesse: 

http://localhost:8080/swagger-ui/index.html

Para ter acesso aos endpoints. 



*Grato pela oportunidade!*

