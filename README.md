# Validação de CPF

Este projeto é uma aplicação Spring Boot simples que tenta implementar a validação de um número de CPF (Cadastro de Pessoas Físicas) brasileiro.

**Atenção**: A lógica de validação de CPF presente neste código está incompleta e não funciona corretamente. Ela serve apenas como um exemplo inicial e **não deve ser utilizada em produção** para validação de CPFs.

## Estrutura do Projeto

O projeto segue a estrutura padrão de uma aplicação Spring Boot:

-   `com.example.validacaocpf.ValidacaoCpfApplication.java`: A classe principal da aplicação, onde a lógica de validação do CPF está implementada diretamente no método `main`.

## Tecnologias Utilizadas

-   **Java**
-   **Spring Boot**: Framework para construção de aplicações Java (neste caso, utilizado de forma mínima, pois a lógica principal está no `main`).
-   **Maven**: Ferramenta de automação de build e gerenciamento de dependências.

## Como Rodar o Projeto

1.  **Pré-requisitos**:
    *   Java Development Kit (JDK) 8 ou superior instalado.
    *   Maven instalado.

2.  **Clonar o repositório**:

    ```bash
    git clone <URL_DO_REPOSITORIO>
    cd ValidacaoCPF
    ```

3.  **Compilar e Rodar**:

    Você pode compilar e rodar a aplicação usando Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

    Ao executar, o programa solicitará que você digite um CPF no console.

## Comentários no Código

O arquivo `ValidacaoCpfApplication.java` foi extensivamente comentado para facilitar a compreensão do código, explicando a finalidade de cada parte, bem como as limitações da lógica de validação presente.

## Limitações da Validação de CPF

É importante ressaltar que a validação de CPF neste projeto é **básica e incompleta**. Para uma validação de CPF robusta e precisa, é necessário:

-   Implementar corretamente o algoritmo de cálculo dos dois dígitos verificadores, que envolve somas ponderadas e módulos.
-   Tratar casos especiais, como CPFs com todos os dígitos iguais (ex: 111.111.111-11), que são considerados inválidos pela Receita Federal.
-   Considerar a integração com bibliotecas ou serviços especializados em validação de documentos, se a aplicação exigir alta confiabilidade.

## Contribuição

Sinta-se à vontade para contribuir com este projeto, especialmente para aprimorar a lógica de validação do CPF. Para isso, siga os passos:

1.  Faça um fork do repositório.
2.  Crie uma nova branch (`git checkout -b feature/melhoria-cpf`).
3.  Faça suas alterações e commit (`git commit -m 'Melhora a validação de CPF'`).
4.  Envie para a branch original (`git push origin feature/melhoria-cpf`).
5.  Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.


