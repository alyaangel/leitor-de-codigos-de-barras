
# Leitor de Códigos de Barras - Aplicação em Java

## Visão Geral

O **Leitor de Códigos de Barras** é uma aplicação simples e leve desenvolvida em Java, projetada para capturar e registrar códigos de barras através do console. Com uma interface intuitiva, permite ao usuário inserir múltiplos códigos de barras e, com um clique[enter], gerar um arquivo de texto contendo todos os códigos inseridos.

Ideal para pequenas empresas, gestão de inventário, ou qualquer pessoa que precise capturar e armazenar dados de códigos de barras de forma rápida e eficiente, sem a necessidade de software ou hardware complexos.

## Funcionalidades

- 🚀 **Rápido e Simples**: Insira os códigos de barras via console e capture-os instantaneamente.
- 🖱️ **Acesso Fácil**: Inicie o sistema com um único clique através do arquivo `.bat` fornecido.
- 📝 **Registro Automático**: Após a inserção dos códigos de barras, os resultados são salvos automaticamente em um arquivo `.txt`.
- 💻 **Leve e Eficiente**: Construído em Java, requer poucos recursos para ser executado.

## Como Funciona

1. Execute o sistema clicando duas vezes no arquivo `iniciar.bat`.
2. O console será aberto e solicitará que você insira os códigos de barras.
3. Após inserir todos os códigos desejados, pressione `ENTER`.
4. Os códigos de barras serão automaticamente salvos e exibidos em um arquivo `.txt` gerado (ex.: `codigos.txt`).

## Requisitos

- Java JDK 8 ou superior
- Sistema operacional Windows (para execução do arquivo `.bat`)
- mudar os caminhos no arquivo.bat

## Suporte
Se encontrar algum problema ou tiver sugestões para melhorias, fique à vontade para abrir uma issue no repositório do GitHub.

## Exemplo

Quando o sistema estiver em execução, insira os valores dos códigos de barras no console e pressione `ENTER`. O sistema salvará o seguinte exemplo:

```plaintext
Insira o código de barras:
1234567890123
9876543210987

Códigos de barras salvos no arquivo codigos.txt!como:
1234567890123;9876543210987;

