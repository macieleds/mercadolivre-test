<p align="center"><img width="500" height="210" src="https://i.ibb.co/jGsyd3p/1-0-Hyu03i97p-VH5-TCwlsc-Ag.png"></p>








<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="Desafio 1: Strings"></a>API Rest - Troco</h1>
<h3 class="code-line" data-line-start=2 data-line-end=3 ><a id="Sobre_o_projeto"></a>Sobre o projeto</h3>
<p class="has-line-data" data-line-start="5" data-line-end="6">Considere um operação de pagamento sendo válida quando a mesma possuir as seguintes definições:

<ul>
<li class="has-line-data" data-line-start="14" data-line-end="15">Apresenta uma operação de envio de pagamento</li>
<li class="has-line-data" data-line-start="15" data-line-end="16">Apresenta 3 opções de pagamento.</li>
<li class="has-line-data" data-line-start="16" data-line-end="17">Os pagamentos devem ser dar preferência ao menor número possível de
moedas</li>
<li class="has-line-data" data-line-start="18" data-line-end="19">Lista todos os pagamentos que um usuário realizou</li>
<li class="has-line-data" data-line-start="19" data-line-end="20">Pagamentos válidos possuem value inteiro e maior que 0 (zero)</li>
<li class="has-line-data" data-line-start="20" data-line-end="21">Pagamentos válidos possuem totalReceived inteiro e maior que 0 (zero)</li>
</ul>


<h1 class="code-line" data-line-start=23 data-line-end=24 ><a id="Funcionalidades_23"></a>Funcionalidades e instruções de uso</h1>
<p class="has-line-data" data-line-start="25" data-line-end="28">A API expõe um endpoint que envia um pagamento, tomando como parâmetros o ID do pagador, o valor dos produtos e o valor total recebido e um endpoint que lista todos os pagamentos que um usuário realizou, de acordo com os critérios estabelecidos acima.
<br>Esse tutorial orienta sobre as funcionalidades da API utilizando o [Postman] (https://www.postman.com/) para o envio de requisições.<br>
  
<br>O projeto foi desenvolvido utilizando Java 17. Portanto, é importante que a API seja executada utilizando esta versão.<br>  

<p class="has-line-data" data-line-start="37" data-line-end="38"><img width="550" height="400" img src="https://iili.io/WWb3dl.md.png" alt="N|Solid"></p>



<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>1 - Executando o projeto</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">Após baixar o projeto, no diretório main, clique com o botão direito na classe PaymentApplication e execute a aplicação em Run.</p>

<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>2 - Envio de pagamento</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">Para envio de pagamento, será feita uma requisição POST em:</p>
<pre><code class="has-line-data" data-line-start="33" data-line-end="35" class="language-sh">http://localhost:<span class="hljsnumber">8080</span>/payers/{payerId}/payments
</code></pre>
<p class="has-line-data" data-line-start="35" data-line-end="36">Nessa requisição serão informados o ID do pagador na URI, o valor dos produtos e o valor total recebido no corpo da requisição, conforme exemplo abaixo:</p>

<p class="has-line-data" data-line-start="37" data-line-end="38"><img width="650" height="350" img src="https://iili.io/WX94cb.md.png" alt="N|Solid"></p>


<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>2 - Listagem de pagamentos realizados por usuário</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">Para listagem de pagamentos do usuário, será feita uma requisição GET em:</p>
<pre><code class="has-line-data" data-line-start="33" data-line-end="35" class="language-sh">http://localhost:<span class="hljsnumber">8080</span>/payers/{payerId}/payments
</code></pre>
<p class="has-line-data" data-line-start="35" data-line-end="36">Nessa requisição será informado o ID do pagador na URI, conforme exemplo abaixo:</p>

<p class="has-line-data" data-line-start="37" data-line-end="38"><img width="650" height="350" img src="https://iili.io/WXFiHg.md.png" alt="N|Solid"></p>

<p class="has-line-data" data-line-start="37" data-line-end="38"><img width="650" height="350" img src="https://iili.io/WXFpfI.md.png" alt="N|Solid"></p>

























<h3 class="code-line" data-line-start=86 data-line-end=87 ><a id="Contato_86"></a>Contato</h3>
<p class="has-line-data" data-line-start="88" data-line-end="90">E-mail: <a href="mailto:maciel.eds@gmail.com">maciel.eds@gmail.com</a><br>
Linkedin: <a href="https://www.linkedin.com/in/edison-maciel-6a83a14a/">https://www.linkedin.com/in/edison-maciel/</a></p>
