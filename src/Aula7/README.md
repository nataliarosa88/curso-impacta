#INTERFACE

até o java 7 assim:
public interface Eletrodomestico {
    void ligar();
    void desligar();
}

após o java 8 = interface podem ter metodos escritos

static void ligarTudo(Eletrodomestico... eletroArray){
    for (Eletrodomestico eletro : eletroArray) {
        eletro.ligar();
    }

extends = herança
implements = interface (UML --------> )

TO = transient object/ objeto transiente ou temporario
DAO = Data access Object 

constantes = 
posso criar uma interface com constantes por exemplo

nao tem encapsulamento de interface
ela é exposta

static? preciso relembrar

## Métodos default = java 8
só pode ter um metodo default em interface
metodo especializado

a partir do java 9 = metodos privados

tecnicamente interfaces sao publicas
* são ocas
* sao atributos estaticos e finais
+ tem um metodo default
nao podem ser instanciadas
tem semelhanças com classes abstratas
pode implementar mais de uma interface

# Tratamento de exceções

## try/ catch e finally

exceção = a exceção é capturada e entrega para o catch

erro

tratamento = try/ catch e finally = colocar onde potencialmente pode ter falha

try = captura
catch = trata

por ultima a exception

## throws

excecão previsivel = pode sim acontecer 
quem chamou tem que estar preparado pra tratar a exceção

## finally

## error
são mais críticas

## exception

## NullPointerException



cast = conversão

















