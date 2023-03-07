<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

<form method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Montant</label>
    <input type="number" class="form-control" id="exampleInputEmail1" name="montant">
  
  </div>
  <div class="form-group">
  <label for="1">CB</label>
    <input type="radio" name="paiement" id="1" value="CB">
    <label for="carte">Numero carte</label>
    <input type="number" name="numCarte" id="carte">
        <label for="Datecarte">Date expiration carte</label>
    <input type="text" name="dateCarte" id="Datecarte">
    <label for="2">Paypal</label>
    <input type="radio" name="paiement" id="2" value="Paypal">
    <label for="paypal">Numero compte Paypal</label>
    <input type="number" name="numPaypal" id="paypal">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
  <button type="reset" class="btn btn-primary">Reset</button>
</form>

</body>
</html>