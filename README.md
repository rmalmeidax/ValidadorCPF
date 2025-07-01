# ✅ Validador de CPF - Java + Spring Boot

Este é um projeto simples feito com **Java** e **Spring Boot** que valida um número de CPF (Cadastro de Pessoa Física) conforme as regras da Receita Federal do Brasil.

---

## 📌 Funcionalidade

- Recebe um CPF via console (terminal)
- Remove caracteres inválidos
- Verifica se o CPF tem 11 dígitos e se os números não são todos iguais
- Calcula os dois dígitos verificadores
- Informa se o CPF é **válido** ou **inválido**

---

## 🧪 Exemplo de uso

Ao executar a aplicação, será solicitado no terminal:

```
Digite um CPF (apenas números ou com pontuação):
```

Você pode digitar algo como:

```
529.982.247-25
```

Se for válido, a saída será:

```
CPF válido.
```

Se for inválido:

```
CPF inválido.
```

---

## 🚀 Como executar

### Pré-requisitos

- Java 17+
- Maven
- IDE como IntelliJ, Eclipse ou VS Code (opcional)

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/ValidadorCPF.git
cd ValidadorCPF
```

2. Compile e execute com o Maven:

```bash
./mvnw spring-boot:run
```

Ou, se preferir, execute direto pela sua IDE com a classe `ValidacaoCpfApplication`.

---

## 📁 Estrutura do Projeto

```
src
└── main
    └── java
        └── com.example.validacaocpf
            └── ValidacaoCpfApplication.java
```

---

## 🧠 Lógica utilizada

- Cálculo dos dois dígitos verificadores com base em multiplicações sucessivas e módulo 11.
- Regra:
  - Se o resto da soma for menor que 2 → dígito = 0
  - Caso contrário → dígito = 11 - resto

---

## 🛡️ Aviso

Este projeto é **educacional**, com foco na **compreensão da lógica de validação** de CPF.

---

## 🧑‍💻 Autor

Desenvolvido por Rafael Maranduba  
