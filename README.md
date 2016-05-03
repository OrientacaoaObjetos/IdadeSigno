# IdadeSigno

O objetivo desse exercícios é praticar como os métodos de acesso não precisam necessariamente representar um atributo da classe. 

A partir de uma data de nascimento será obtido a idade e o signo.

O projeto irá conter testes unitários.

Testes dependentes do tempomenos 

Observe que a funcionalidade que calcula a idade depende do tempo corrente. Como fazer um teste de unidade, se o seu resultado pode ser diferente daqui a algum tempo? Para isso, precisamos, de alguma forma, controlar o valor retornado quando pedimos o valor do momento corrente.

Crie uma classe chamada Relogio e nessa classe crie um método chamado agora(), que retorna o valor de System.currentTimeMillis(). Crie uma variável, que se o valor dela não for zero, seu valor deve ser retornado no método agora(). Se você utilizar a classe Relogio para obter o tempo, será possível nos testes fazer com que ele retorne sempre um valor fixo! 
