# 📌 Game List Manager  

## 📖 Descrição  
O **Game List Manager** é um sistema CRUD desenvolvido para gerenciar listas personalizadas de jogos (ou qualquer outro tipo de relação entre objetos e grupos). O projeto permite organizar jogos em listas específicas, facilitando a categorização e a personalização.  

Cada jogo pode ser descrito com informações detalhadas, como:  
• Título  
• Gênero  
• Ano de lançamento  
• Plataformas  
• Pontuação  
• Imagens e descrições  

---

## 🛠️ Tecnologias Utilizadas  
O projeto foi desenvolvido utilizando as seguintes tecnologias:  

- **Back-end**  
  - Java (Spring Boot)  
  - Spring Data JPA  
  - JPA (Java Persistence API)  
  - Hibernate (ORM)  
  - PostgreSQL  

- **Ferramentas**  
  - Docker  
  - Postman  

---

## 🗄️ Diagrama do Banco de Dados  

![Image](https://github.com/user-attachments/assets/e12fb1ef-b255-4417-86d3-f39aefeec0f1)

---

## ⚙️ Estrutura do Projeto

  
  📌 APIs RESTful

O sistema fornece endpoints para:

  Criar, consultar e atualizar jogos e listas.

  Organizar jogos em listas personalizadas, permitindo definir posições específicas dentro de cada lista.

  
  📌 Arquitetura MVC

O projeto segue a arquitetura Model-View-Controller (MVC), organizada em camadas:

  Controller: Responsável por expor as APIs REST.

  Service: Contém a lógica de negócios.

  Repository: Responsável pela comunicação com o banco de dados.

  DTOs: Usados para otimizar a transferência de dados e evitar a exposição direta das entidades.


