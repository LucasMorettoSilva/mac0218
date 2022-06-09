# Mini EP3

Abaixo estão alguns exemplos de códigos ruins de se ler e entender.

## Arrow anti-pattern

O trecho de código abaixo apresenta o arrow anti-pattern, onde estão 
aninhadas diferentes condicionais no código gerando uma função díficil
de ler e entender. O arrow anti-pattern cria códigos muito propensos a
erros e de dificil manutenção.

```java
public String cadastrar(String username, String password) {
    if (username != null) {
        if (username.length() > 7) {
            if (password != null) {
                if (password.length() > 6) {
                    if (password.matches(".*[0-9].*")) {
                        if (password.matches(".*[a-z].*")) {
                            if (password.matches(".*[A-Z].*")) {
                                if (password.matches(".*[*-+!@#$%].*")) {
                                    efetivarCadastro(username, password);
                                    return "cadastro efetivado";
                                } else return "senha deve conter caracteres especiais";
                            } else return "senha deve conter uma letra maiuscula";
                        } else return "senha deve conter uma letra minuscula";
                    } else return "senha deve conter um número";
                } else return "senha deve ter no minimo 7 caracteres";
            } else return "senha não deve ser null";
        } else return "usuario deve ter no minimo 8 caracteres";
    } else return "usuario não deve ser nulo";
}
```

Pode-se melhorar o código acima invertendo os condicionais (de verificações
positivas para negativas), podemos decompor a função em diferentes funções 
menores encapsulando a lógica (uma para verificar o username e outra para
verificar a senha), etc. Geralmente deve-se programar tentando "retornar",
"finalizar" a função o mais cedo possível.

## One-liner

Escrever tudo em uma só linha também não é algo muito interessante...

Além de deixar o código mais díficl de ler e entender, isso prejudica a 
manutenção futura do mesmo.

```java
public String isValid(String s) { if (s == null) return "a string é inválida"; else if (s.length() > 5) return "a string é válida"; else return "a string é inválida"; }
```

## Nomes significativos para variáveis

O nome de uma variável, função ou classe deve ser significativo e explicar por
si só o que ele representa. Deve dizer por que existe, o que faz e como é usado.
Uma boa dica de se está programando de forma correta é que, se um nome requer um
comentário, então o nome escolhido não revela sua intenção explicitamente.

### Exemplo ruim

```java
// registro de data e horario
class DtaRcrd102 {
    private Date crtymdhms; // creation timestamp
    private Date updymdhms; // update timestamp
}
```

### Exemplo bom

```java
class RegistroData {
    private Date creationTimestamp;
    private Date updateTimestamp;
}
```
