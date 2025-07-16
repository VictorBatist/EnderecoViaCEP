# 🏠 EnderecoViaCEP

Repositório com implementação em Java que consome a API ViaCEP para buscar informações de endereço com base no CEP informado pelo usuário.

## 🔍 Descrição

Este projeto permite consultar endereços (logradouro, bairro, cidade, UF e mais) a partir de um CEP válido no Brasil, utilizando a API pública do ViaCEP (https://viacep.com.br). 

Serve como base para estudos de consumo de APIs REST em projetos pessoais, testes de integração ou automações.

## ⚙️ Funcionalidades

    Consulta de endereço por CEP (somente numérico, com ou sem traço).

    Tratamento de erros e respostas inválidas (CEP não encontrado ou formato incorreto).

    Exibição amigável dos dados retornados (via console).

    Possível estrutura para expansão: testes unitários, GUI, integração com sistemas maiores.

## 🛠️ Tecnologias Utilizadas

    Linguagem: Java.

    Biblioteca HTTP: HttpClient.

    Processamento JSON: Gson.

    Gestão do projeto: IDEs como IntelliJ.

## 🚀 Como Executar

Clone o repositório:

```
git clone https://github.com/VictorBatist/EnderecoViaCEP.git
```
```
cd EnderecoViaCEP
```

## 🧪 Exemplos de Uso

Informe o CEP (apenas números): 01001000

Resultado:
Logradouro: Praça da Sé
Bairro: Sé
Cidade: São Paulo
UF: SP


## 🧭 Boas práticas e melhorias

    Validar formato do CEP (8 dígitos).

    Tratar exceções de rede e respostas HTTP (404, 500).

    Adicionar testes unitários para ViaCepClient.

    Criar uma interface gráfica (Swing, JavaFX) ou API REST local.

    Implementar cache local para evitar múltiplas requisições da mesma consulta.

## 👨‍💻 Autor

    Victor Batista – GitHub
