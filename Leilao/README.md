1. Vamos incorporar algumas restrições ao sistema. Elabore uma solução que permita a
ocorrência de uma exceção para o caso de se registrar lances em um pregão fechado.

2. Disponibilizar uma listagem de lances em ordem crescente por valor do lance.

3. Disponibilizar uma listagem de lances em ordem decrescente por valor do lance.

4. Disponibilizar uma listagem de lances em ordem alfabética por nome do cliente.

5. Crie uma classe para representar um leilão. Ela dever ser responsável pelas seguintes
funcionalidades:

    a) Abrir e fechar o pregão.

    b) No caso do pregão aberto, obter os lances de um cliente para um lote enquanto o
    intervalo entre lances for inferior a 10 segundos. Para cada lance realizado a contagem
    de tempo deve ser reiniciada. Caso o intervalo entre lances for superior a 10 segundos
    o pregão deve ser fechado e status do lote atualizado (arrematado ou não). Ao fim dos
    10 segundos se houve lance anterior o lote deve ser considerado arrematado, caso
    contrário, considere o lote NÃO arrematado.

    c) Listar todos os lances de um pregão, agrupado por lote. Não se esqueça de informar o
    status de cada lote

6. Faça os testes necessários.

7. APRESENTAÇÃO DO SISTEMA PARA AVALIAÇÃO.
