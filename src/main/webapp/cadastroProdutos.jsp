<%-- 
    Document   : cadastroProdutos
    Created on : 20/04/2018, 09:13:20
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Produto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

         <!-- Latest compiled JavaScript -->
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <style>
             ul.dropdown-menu{background-color: black;}
         </style>
    </head>
    <body>
       <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="inicio.jsp"><font color="yellow">Caminho dos Brindes</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="inicio.jsp"><font color="yellow">Home</font></a></li>
     <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Produtos</font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
            <li><a href="#"><font color="yellow">Tipos</font></a></li>
          <li><a href="#"><font color="yellow">Promoção</font></a></li>
          <li><a href="#"><font color="yellow">Novidades</font></a></li>
          
        </ul>
      </li>
      <li><a href="#"><font color="yellow">Page 2</font></a></li>
      <li><a data-toggle="modal" data-target="#myModal"><font color="yellow">Sobre</font></a></li>
       
    </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Usuários</font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
            
             <li><a href="listarUsuarios.jsp"><font color="yellow"><span class="glyphicon glyphicon-list-alt"></span> Listar Usuários</font></a><li>
            <li><a href="deletarUsuarios.jsp"><font color="yellow"><span class="glyphicon glyphicon-remove"></span> Deletar usuários</font></a></li></ul></li>
          <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Produtos</font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
             <li><a href="cadastroProdutos.jsp"><font color="yellow"><span class="glyphicon glyphicon-plus"></span> Cadastrar Produtos</font></a><li>
            <li><a href="editarProduto.jsp"><font color="yellow"><span class="glyphicon glyphicon-edit"></span> Editar Produtos</font></a><li>
          <li><a href="listarProdutos.jsp"><font color="yellow"><span class="glyphicon glyphicon-list-alt"></span> Listar Produtos</font></a><li>
       <li><a href="deletarProdutos.jsp"><font color="yellow"><span class="glyphicon glyphicon-remove"></span> Deletar Produtos</font></a><li></ul></li>
       <li><a href="inicio.jsp"><font color="yellow"><span class="glyphicon glyphicon-log-out"></span> Sair</font></a></li>
     
    </ul>
  </div>
</nav>   
        <br><br>
        <div class="container">
        <form action ="AdicionarProduto" method="post">
            <div class="container">
          <div class="form-group">
    <label for="Nome_produto">Nome:</label>
    <input type="name" class="form-control" id="Nome_produto">
     </div>
          <div class="form-group">
    <label for="Altura_produto">Altura do Produto : (Em metros)</label>
    <input type="float" class="form-control" id="Altura_produto">
  </div>     
         <div class="form-group">
    <label for="Largura_produto">Largura do Produto: (Em metros)</label>
    <input type="float" class="form-control" id="Largura_produto">
  </div>   
         <div class="form-group">
    <label for="Quantidade_produto">Quantidade minima para compra:</label>
    <input type="number" class="form-control" id="Quantidade_produto">
  </div> 
         <div class="form-group">
    <label for="preco_produto">Preço por Unidade :</label>
    <input type="float" class="form-control" id="preco_produto">
  </div> 
          <div class="form-group">
    <label for="Descricao_produto">Descrição:</label>
    <textarea class="form-control" rows="5" id="Descricao_produto"></textarea>

  </div>  
         <div class="form-group">
    <label for="tipo_produto">Tipo do produto:</label>
    <input type="name" class="form-control" id="tipo_produto">
         </div>  <br>
         <label> Cor do produto : </label><br>
<label class="checkbox-inline"><input id="cor_vermelho"type="checkbox" value="Sim">Vermelho</label>
<label class="checkbox-inline"><input id="cor_azul"type="checkbox" value="Sim">Azul</label>
<label class="checkbox-inline"><input id="cor_preto" type="checkbox" value="Sim">Preto</label>
<label class="checkbox-inline"><input id="cor_branco" type="checkbox" value="Sim">Branco</label><br><br>
<label >Outras Cores :</label><input id="OutrasCores" type="name" class="form-control">

<br><br>
 <label>Imagens : </label><br>
<input type="file" id="image1"/>
<input type="file" id="image2"/>
<input type="file" id="image3"/>
<input type="file" id="image4"/>
<input type="file" id="image5"/>

<br><br>
            <button type="button" class="btn btn-success">Cadastrar</button>
            <button type="button" class="btn btn-danger">Cancelar</button>
            </div>
            
        </form> 
        </div>
        
        <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Caminho dos brindes</h4>
      </div>
      <div class="modal-body">
          <div class="container">
              <img class="center" width="350px" height="200px" hspace="60px"  src="logo.jpeg" ></div>
          <br><br>
          
          
          
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
         
    </body>
</html>
