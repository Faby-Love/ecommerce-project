
# E-commerce Project

### Descrição
Este projeto é um sistema de e-commerce completo, desenvolvido com uma stack moderna. O objetivo é simular um ambiente de compras online, onde os usuários podem navegar por produtos, realizar cadastros, efetuar compras com diferentes formas de pagamento (boleto, Pix e cartão de crédito), e receber notificações de transações. O projeto utiliza **microserviços**, **containerização**, e segue as melhores práticas de **DevOps** para deploy em ambientes de produção na **AWS**.

## Arquitetura
O projeto é dividido em três grandes componentes:

- **Backend**: Desenvolvido em **Java 17** utilizando o framework **Spring Boot**. O backend expõe APIs RESTful para a gestão de produtos, usuários, pagamentos e notificações.
  
- **Frontend**: Construído com **Angular 8** e **TypeScript**. A interface do usuário permite a navegação pelos produtos, login, cadastro e realização de compras.
  
- **DevOps**: Automatização de processos de build, teste e deploy utilizando **Jenkins**, com deploy na **AWS** utilizando **Docker** e **Kubernetes** para gerenciar a aplicação.

## Tecnologias Utilizadas

### Backend
- **Java 17**
- **Spring Boot (MVC, Data JPA)**
- **MySQL** (via Docker)
- **Kafka** (para mensageria)
- **Docker** (para containerização)
- **Kubernetes** (para orquestração de containers)
- **JUnit** (para testes unitários e de integração)

### Frontend
- **Angular 8**
- **TypeScript**
- **HTML5/CSS3**

### DevOps
- **Jenkins** (para CI/CD)
- **Git & GitHub** (para controle de versão)
- **AWS Free Tier** (para hospedagem)
- **Docker & Kubernetes** (para containerização e orquestração)
- **Jira** (para gerenciamento de tarefas com Scrum)

## Funcionalidades

### Backend
- **APIs de Produtos**: CRUD de produtos (Criar, Visualizar, Atualizar e Excluir).
- **APIs de Usuários**: CRUD de usuários (Criar conta, Login, Atualizar e Excluir).
- **API de Pagamentos**: Simulação de pagamentos via boleto, Pix e cartão de crédito.
- **Mensageria**: Envio de e-mails para confirmar as compras via Kafka.
- **Monitoramento de Transações**: Verificar status de pagamento e notificar o usuário.

### Frontend
- **Página de Produtos**: Listagem de produtos com filtros e busca.
- **Carrinho de Compras**: Adicionar/remover produtos e calcular o valor total.
- **Cadastro e Login de Usuário**: Funcionalidade completa de autenticação.
- **Pagamento**: Integração com API de pagamento, permitindo ao usuário escolher o método de pagamento.

### DevOps
- **CI/CD Automatizado**: Pipelines configurados no Jenkins para build, testes automatizados e deploy.
- **Containerização**: Toda a aplicação é conteinerizada com Docker.
- **Orquestração**: A aplicação é gerenciada por meio de Kubernetes.
- **Deploy na AWS**: A aplicação é implantada na nuvem utilizando o AWS Free Tier.

## Como Rodar o Projeto Localmente

### Pré-requisitos
1. **Git**: Para clonar o repositório.
2. **Java 17**: Para rodar o backend.
3. **Node.js & npm**: Para rodar o frontend.
4. **Docker**: Para rodar o MySQL, Kafka e outros serviços.
5. **Kubernetes (Minikube)**: Para orquestração local dos containers (opcional).

### Instruções de Setup

#### 1. Clone o Repositório
\`\`\`bash
git clone https://github.com/Faby-Love/ecommerce-project.git
cd ecommerce-project
\`\`\`

#### 2. Configuração do Backend
- Entre na pasta do backend:
  \`\`\`bash
  cd ecommerce-backend
  \`\`\`
- Certifique-se de que o MySQL está rodando via Docker:
  \`\`\`bash
  docker run --name ecommerce-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=ecommerce -p 3306:3306 -d mysql:8.0
  \`\`\`
- Execute o projeto Spring Boot:
  \`\`\`bash
  ./mvnw spring-boot:run
  \`\`\`

#### 3. Configuração do Frontend
- Entre na pasta do frontend:
  \`\`\`bash
  cd ecommerce-frontend
  \`\`\`
- Instale as dependências do Angular:
  \`\`\`bash
  npm install
  \`\`\`
- Inicie o servidor de desenvolvimento do Angular:
  \`\`\`bash
  ng serve
  \`\`\`

#### 4. Acesse a Aplicação
- Acesse o frontend no navegador em: [http://localhost:4200](http://localhost:4200)
- O backend está rodando na porta: [http://localhost:8080](http://localhost:8080)

## Como Contribuir

1. Faça um Fork do projeto.
2. Crie uma nova Branch para sua feature:
   \`\`\`bash
   git checkout -b minha-feature
   \`\`\`
3. Commit suas mudanças:
   \`\`\`bash
   git commit -m "Adicionei nova feature"
   \`\`\`
4. Push para a branch:
   \`\`\`bash
   git push origin minha-feature
   \`\`\`
5. Abra um Pull Request no repositório original.

## Pipeline de CI/CD

- O **Jenkins** está configurado para rodar pipelines que:
  - Fazem o build da aplicação backend e frontend.
  - Executam os testes automatizados.
  - Realizam o deploy automático na **AWS**.

## Roadmap

### Funcionalidades Futuras:
- Integração com sistemas de pagamento reais.
- Autenticação com OAuth.
- Interface de administração para gerenciar pedidos e estoque.
- Testes automatizados de frontend com **Cypress**.

## Autores

- **Erick Alan** - Full Stack Developer - [GitHub](https://github.com/erickalandev)
- **Alanis Mayra** - QA Developer - [GitHub](https://github.com/alanismayra)

## Licença
Este projeto não está sendo licenciado.

## Contato
Se tiver dúvidas ou sugestões, entre em contato:
- **Email**: ecommerceprojectpleno@gmail.com
