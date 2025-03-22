# 🏦 **API de Transações Financeiras - Desafio Itaú**

## 📋 **Descrição**
API REST desenvolvida como parte do desafio técnico do Itaú, focada no gerenciamento de transações financeiras. A aplicação permite a criação e remoção de transações, garantindo validações específicas para datas e valores.

## 🚀 **Tecnologias Utilizadas**
- **Java 21**
- **Spring Boot 3.4.3**
- **Maven**
- **Spring Validation**
<<<<<<< HEAD
- **Springdoc OpenAPI (Documentação da API com Swagger UI)**
=======
>>>>>>> cb7e1fe3f18c9bb124286fa2f691b48a62611e22

## 📦 **Pré-requisitos**
Antes de executar a aplicação, certifique-se de ter instalado:
- **Java JDK 21**
- **Maven**
- **Uma IDE de sua preferência** (recomendado: VS Code ou IntelliJ)

## 🛠️ **Instalação e Execução**

### 🔹 **1. Clone o repositório:**
```bash
git clone https://github.com/lemosdevv/desafio-itau-backend.git
```

### 🔹 **2. Acesse o diretório do projeto:**
```bash
cd desafio-itau-backend
```

### 🔹 **3. Execute o build do projeto:**
```bash
mvn clean install
```

### 🔹 **4. Inicie a aplicação:**
```bash
mvn spring-boot:run
```

## 🔍 **Endpoints da API**

### 📌 **Criar Transação**
- **Método:** `POST`
- **Endpoint:** `/itau-api`
- **Descrição:** Cria uma nova transação financeira.
- **Corpo da requisição:**
```json
{
    "value": 100.50,
    "date": "2024-03-16T10:30:00Z"
}
```
- **Validações:**
  - A **data** não pode ser futura.
  - O **valor** deve ser maior que zero.

### 🗑️ **Deletar Transações**
- **Método:** `DELETE`
- **Endpoint:** `/itau-api`
- **Descrição:** Remove todas as transações cadastradas.

<<<<<<< HEAD
## 📚 Documentação da API
**A documentação da API está disponível via Swagger UI. Após iniciar a aplicação, acesse:
Swagger UI: http://localhost:8080/swagger-ui.html**
=======
## ✅ **Testes**
Para executar os testes automatizados, utilize o seguinte comando:
```bash
mvn test
```
>>>>>>> cb7e1fe3f18c9bb124286fa2f691b48a62611e22

## 🔒 **Validações Implementadas**

### 💰 **Valor da Transação**
- Deve ser **maior que zero**.
- Não pode ser **nulo**.

### 📅 **Data da Transação**
- Não pode ser **futura**.
- Não pode ser **nula**.

## 👨‍💻 **Autor**
- **Nome:** Mateus Lemos do Nascimento
- **Email:** teuse853@gmail.com

## 📄 **Licença**
Este projeto está sob a **licença MIT** - consulte o arquivo LICENSE para mais detalhes.