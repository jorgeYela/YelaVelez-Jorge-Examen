<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" >    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="http://localhost:8080/PracticaServJSPyJDBC/diseno/css/diseno.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
    <!-- Bootstrap core CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">
    <title>Registrar Telefono</title>

</head>
<body style="background-color: #575757;">
	<c:set var="correo" scope="request" value="${param.correo}" />
	<main role="main" class="container my-auto">
		<div class="row">
			<div id="registro" class="col-lg-4 offset-lg-4 col-md-6 offset-md-3
                    col-12">
                    <h2 class="text-center" style="color: white; font-size: 40px">Añadir Nuevo Numero Telefonico</h2>
                    <form  class="form-group" action="http://localhost:8080/YelaVelez-Jorge-Examen/CrearTelefono" method="GET">
                    	<div class="form-group">
                    		<label style="color: white; font-size: 20px; padding-top: 15px" for="correo">Correo</label>
                            <input style="font-size: 20px" class="form-control" id="correo" name="correo" class="form-control" value=<%=request.getParameter("correo") %> >
                    		<label style="color: white; font-size: 20px; padding-top: 15px" for="numero">Numero</label>
                            <input style="font-size: 20px" class="form-control" id="numero" name="numero" class="form-control" placeholder="Numero...">
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="tipo">Tipo</label>
                            <select  style="font-size: 20px" class="form-control" id="exampleFormControlSelect1" name="tipo">
						        <option style="font-size: 20px">Celular</option>
								<option style="font-size: 20px">Convencional</option>
							</select>
                            <label style="color: white; font-size: 20px; padding-top: 8px" for="operadora">Operadora</label>
                            <select  style="font-size: 20px" class="form-control" id="exampleFormControlSelect1" name="operadora">
						        <option style="font-size: 20px">Claro</option>
								<option style="font-size: 20px">Movistar</option>
								<option style="font-size: 20px">Tuenti</option>
								<option style="font-size: 20px">CNT</option>
							</select>
                    	</div>
                    	<div class="form-group">
    						<INPUT style="font-size: 20px" type="submit" class="btn-info" value="Enviar"> <INPUT style="font-size: 20px" type="reset" class="btn-info" value="Resetear">
    					</div>
                    </form>
			</div>
		</div>
	</main>
</body>
</html>