# Cap. 16 - Arquivos I/O - NIO

##Arquivos I/O = basico de manipulação

* Banco de dados é um tipo de I/O
* não é apenas um arquivo mas sim conectividade
* Existem três conjuntos de java 
* A ideia é gravar um arquivo - eu quero colocar informações que não estão nele e vão para dentro dele
* Fluxo entre a memória e o disco
* fluxos são controlaveis
* memória/ disco (stream - interface - )
* inputstream - entrada - ler - fluxo para do meio físico para memória (disco)
* outputstream - saída - algo que está na memória (disco) para o meio físico
    
+ muito comum em java usar um stream associado ao arquivo porque ele já tem metodos associados, e uma classe que trata  

writeChars - coloca tipo um espaco

FileInputStream - leitura de streams em bytes

Classe File - indicar um arquivo ou diretório/ criar arquivo dentro do java
File file = new File("br/pasta/arquivo.txt");

não cria diretorios, apenas arquivos

##socket = também são I/O
##server socket
conectam através de rede

#try-with-resources

existe desde a versão 7

toda vez que lida com algum recurso (arquivo/ banco de dados), tem a necessidade de fechar a conexão ou fechar o arquivo
autoCloseable
Closeable

Classe FileReader = não tem stream dentro dela
não tem metodos para fazer o fluxo da leitura
normal associar a classe FileReader com o InputStreamReader
normal tambem adicionar a classer BufferedReader
Buffer - memoriazinha - classe que colocou um conjunto de dados em memoria

# NIO - arquivos e diretorios

A nova API NIO traz o pacote java.nio.file e suas principais classes (Path,
Paths e Files), em que temos uma reformulação das rotinas antes executadas
pela classe java.io.File.


As classes centrais das APIs NIO são:
• Path: Um arquivo ou diretório do sistema de arquivos;
• Paths: Classe utilitária responsável pela geração de um Path a partir do
caminho especificado;
• Files: Classe utilitária responsável pela manipulação de um Path como
busca de arquivos;
• Buffers: Recipientes para os dados;

codificador = grava dentro do arquivo
decodificador


