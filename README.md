
# Abstract Factory 🏭
Neste desafio elaborado pela  [DIO](https://web.dio.me/home) vimos três tipos de padrões de projetos. Padrão criacional, vimos o Singleton. Padrão estrutural, facade. E Padrão comportamental, foi visto o Strategy. Combinando teoria e prática, destes padrões, podemos também pôr em prática os padrões de projetos em uma API REST com Spring. 

### Obtetivo 🎯
Como objetivo a alcançar, fomos desafiados a implementar um padrão de projeto que não foi abordado no módulo. Como o titulo desse readme demostra, o escolhido por mim foi o Abstract Factory.

#### Abstract Factory 📚
Complexidade ⭐⭐⭐

Popularidade ⭐⭐⭐⭐⭐

O Abstract Factory é um padrão de projeto criacional, onde é definida uma interface para a criação dos produtos de maneira distinta, mas a criação real do produto é atribuição das classes fábricas concretas. Assim cada tipo de fábrica concreta corresponde a um tipo de produto. 

O código cliente chama os comportamentos de criação de um objeto fábrica abstrata ao invés de criar por meio de um construtor. 

O código cliente trabalha com fábricas e produtos através de suas interfaces abstratas. Permitindo que o código cliente funcione com produtos diversos. Só precisamos criar uma classe fábrica concreta e passar para o código cliente.   

### Estrutura 

![UML Abstract Factory](https://github.com/JardelLimaDev/Dio-desafio-padroes-de-projetos/assets/98830508/8489b559-1873-4322-bbf9-63105a4cf27d)
