## 🚀 O que aprendi com este desafio

Neste projeto, pude consolidar os fundamentos da Programação Orientada a Objetos (POO) em Java, aplicando-os num cenário real de gestão de Bootcamps:

- **Abstração 🧩**: Criação da classe abstrata `Conteudo`, que serve como base comum para cursos e mentorias, definindo os atributos essenciais como título e descrição.
- **Herança 🧬**: Implementação das classes `Curso` e `Mentoria`, que herdam os comportamentos e atributos da classe progenitora `Conteudo`, permitindo o reaproveitamento de código.
- **Polimorfismo ✨**: Utilização da sobrescrita de métodos (Override), como no caso do método `calcularXp()`, onde cada tipo de conteúdo (Curso ou Mentoria) possui a sua própria lógica de cálculo de experiência.
- **Encapsulamento 🔒**: Proteção dos dados das classes através de modificadores de acesso e disponibilização de métodos `getters` e `setters` para manipulação segura dos atributos.
- **Coleções (Collections) 📚**: Utilização de `Set` (`LinkedHashSet` e `HashSet`) para gerir a lista de conteúdos e os programadores (Devs) inscritos, garantindo a unicidade dos elementos e, em alguns casos, a ordem de inserção.
